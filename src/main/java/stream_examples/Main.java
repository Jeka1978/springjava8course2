package stream_examples;

import org.fluttercode.datafactory.impl.DataFactory;

import java.util.stream.Stream;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        DataFactory dataFactory = new DataFactory();
        Stream.generate(dataFactory::getAddress).limit(10).forEach(System.out::println);
        Stream<String> stream = Stream.of("Java","SCala","Groovy","Kotlin");
        stream.unordered()
                .filter(s -> s.startsWith("S"))
                .forEach(System.out::println);
    }
}
