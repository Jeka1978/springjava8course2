package spring_paterns.command_strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.toMap;

/**
 * @author Evgeny Borisov
 */
@Service
public class MessageDistributor {
    @Autowired
    private Map<String, Sender> map = new HashMap<>();

   /* @Autowired
    public MessageDistributor(List<Sender> senders) {
        map = senders.stream().collect(toMap(Sender::myType, s -> s));
    }*/

    public void distribute(Message message) {
        Sender sender = map.getOrDefault(Integer.toString(message.getSendingType()), m -> {
            throw new IllegalStateException(message.getSendingType() + " is not supported yet");
        });
        sender.send(message);

    }


    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("spring_paterns.command_strategy");
        MessageDistributor distributor = context.getBean(MessageDistributor.class);
        distributor.distribute(
                Message.builder()
                        .content("hello Gena")
                        .sendingType(3)
                        .to("05233333")
                        .build());
    }
}



