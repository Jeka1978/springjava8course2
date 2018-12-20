package spring_paterns.command_strategy;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component("2")
public class SmsSender implements Sender {
    @Override
    public void send(Message message) {
        // 50 lines of code
        System.out.println(message.getContent()+" was sent by sms");
    }
}
