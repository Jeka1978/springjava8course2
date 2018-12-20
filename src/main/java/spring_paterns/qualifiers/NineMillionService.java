package spring_paterns.qualifiers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
public class NineMillionService {
    @Regular
    private DiscountHandler discountHandler;

    @Scheduled(fixedDelay = 500)
    public void doWork() {
        System.out.println("NineMillionService is working");
        System.out.println(discountHandler.calc(9000));
    }
}



