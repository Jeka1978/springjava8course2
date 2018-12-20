package home_work;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.Stream;

/**
 * @author Evgeny Borisov
 */
public class WordUtil {
    @SneakyThrows
    public static void main(String[] args) {
        Stream<String> lines = new BufferedReader(new FileReader("data/yest")).lines();
        //        lines.forEach(System.out::println);
        System.out.println("lines.count() = " + lines.count());
        IntSummaryStatistics statistics = lines.mapToInt(String::length).summaryStatistics();
        System.out.println("avg = " + statistics.getAverage());
        System.out.println("sum = " + statistics.getSum());
        System.out.println("sum = " + statistics.getMax());

        long count = lines.map(String::toLowerCase)
                .flatMap(s -> Arrays.stream(s.split("\\W+")))
                .count();
        System.out.println("count = " + count);



    }
}
