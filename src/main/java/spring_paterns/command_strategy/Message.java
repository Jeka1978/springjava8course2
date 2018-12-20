package spring_paterns.command_strategy;

import lombok.Builder;
import lombok.Data;

/**
 * @author Evgeny Borisov
 */
@Data
@Builder
public class Message {
    private String content;
    private String to;
    private int sendingType;
}
