package stream_examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.*;

/**
 * @author Evgeny Borisov
 */
public class EmployeeUtil {


    public static void printSalaryVsName(List<Employee> employees) {
        Map<Integer, String> map = employees.stream()
                .collect(toMap(Employee::getSalary, Employee::getName,
                        (name1,name2) ->name1+name2
                        ));
        System.out.println(map);
    }


    public static Map<Seniority, List<String>> groupBySeniority(List<Employee> employees) {
       return employees.stream()
                .collect(groupingBy(
                        employee -> Seniority.bySalary(employee.getSalary()),
                        mapping(Employee::getName, toList())));
    }


    public void stam() {
        IntStream stream = IntStream.range(1, 100);
        int[] ints = stream.toArray();

        Stream<String> stream12 = Stream.of("a", "b");
        List<String> list = stream12.collect(toList());


    }

    public static void main(String[] args) {
        List<Employee> employees = asList(
                Employee.builder().name("Elad").salary(5000).build(),
                Employee.builder().name("Avishay").salary(40000).build(),
                Employee.builder().name("Yudit").salary(40000).build(),
                Employee.builder().name("Maor").salary(19000).build()
        );
        Map<Seniority, List<String>> map = groupBySeniority(employees);
        printSalaryVsName(employees);
//        System.out.println("map = " + map);

//        totalSalaryWithIntStream(employees);
//        printAllNamesDividedByComma(employees);
    }


    public static void printAllNamesDividedByComma(List<Employee> employees) {
        employees.stream()
                .map(Employee::getName)
                .reduce((name1, name2) -> name1 + ", " + name2)
                .ifPresent(System.out::println);
    }


    public static int totalSalaryWithIntStream(List<Employee> employees) {
        int sum =
                employees.stream()
                        .mapToInt(Employee::getSalary)
                        .sum();


        return sum;
    }

    public int totalSalary(List<Employee> employees) {
        return employees.stream()
                .map(Employee::getSalary)
                .reduce((salary1, salary2) -> salary1 + salary2).orElse(12);

    }
}
