package spring_paterns.chain_of_responsibility;

import lombok.Builder;
import lombok.Data;

/**
 * @author Evgeny Borisov
 */
@Data
@Builder
public class IDIClient {
    private String name;
    private int age;
    private String email;
}
