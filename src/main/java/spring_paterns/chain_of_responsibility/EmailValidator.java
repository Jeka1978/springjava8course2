package spring_paterns.chain_of_responsibility;

import org.springframework.context.annotation.DependsOn;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

/**
 * @author Evgeny Borisov
 */
@Component
@Order(2)
public class EmailValidator implements IDISimpleValidator {
    @Override
    public Stream<String> getViolations(IDIClient client) {
        Stream.Builder<String> builder = Stream.builder();
        if (client.getEmail() == null) {
            return Stream.of("email can't be null");
        }
        if (!client.getEmail().contains("@")) {
            builder.add("mail must have @");
        }
        if (!client.getEmail().contains("\\.")) {
            builder.add("mail must have dot");
        }
        return builder.build();
    }
}
