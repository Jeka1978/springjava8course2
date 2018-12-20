package spring_paterns.chain_of_responsibility;

import java.util.stream.Stream;

/**
 * @author Evgeny Borisov
 */
public interface IDISimpleValidator {
    Stream<String> getViolations(IDIClient client);
}
