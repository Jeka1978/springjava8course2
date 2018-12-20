package spring_paterns.a;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
@Order(3)
public class ExpensiveHandler implements ProductHandler {
    @Override
    public boolean handle(Product product) {
        System.out.println(product + " was handled by ExpensiveHandler");
        return true;
    }
}





