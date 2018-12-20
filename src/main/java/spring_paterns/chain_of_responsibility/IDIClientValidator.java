package spring_paterns.chain_of_responsibility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Service
public class IDIClientValidator {
    @Autowired
    private List<IDISimpleValidator> validators;

    public void printViolations(IDIClient client) {
        validators.stream()
                .flatMap(validator -> validator.getViolations(client))
                .forEach(System.out::println);
    }
}




