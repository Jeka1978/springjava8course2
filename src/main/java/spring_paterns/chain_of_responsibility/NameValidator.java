package spring_paterns.chain_of_responsibility;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

/**
 * @author Evgeny Borisov
 */
@Component
@Order(1)
public class NameValidator implements IDISimpleValidator {
    @Override
    public Stream<String> getViolations(IDIClient client) {
        Stream.Builder<String> builder = Stream.builder();
        if (client.getName() == null) {
            builder.add("name can't be null");
        }
        return builder.build();

    }
}
