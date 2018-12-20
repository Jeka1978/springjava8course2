package spring_paterns.qualifiers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
public class IDIService {

    @Premium
    private DiscountHandler discountHandler;

    @Scheduled(fixedDelay = 1000)
    public void doWork() {
        System.out.println("IDIService is working");
        System.out.println(discountHandler.calc(100));
    }

}




