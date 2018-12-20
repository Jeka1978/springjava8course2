package spring_paterns.chain_of_responsibility;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

/**
 * @author Evgeny Borisov
 */
@Component
@Order(3)
public class AgeValidator implements IDISimpleValidator {
    @Override
    public Stream<String> getViolations(IDIClient client) {
        Stream.Builder<String> builder = Stream.builder();

        if (client.getAge() < 0) {
            builder.add("age can't be negative");
        }
        if (client.getAge() > 120) {
            builder.add("age too big");
        }

        return builder.build();
    }
}
