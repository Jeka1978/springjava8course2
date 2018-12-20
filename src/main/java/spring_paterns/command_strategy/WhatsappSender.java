package spring_paterns.command_strategy;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component("3")
public class WhatsappSender implements Sender {
    @Override
    public void send(Message message) {
        System.out.println(message.getContent()+" was sent by whatsapp");
    }
}
