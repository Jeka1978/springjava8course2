package spring_paterns.command_strategy;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component("1")
public class EmailSender implements Sender {
    @Override
    public void send(Message message) {
        // 30 lines of code
        System.out.println(message.getContent()+" was sent by mail");
    }
}
