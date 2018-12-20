package spring_paterns.a;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
@Order(2)
public class MidHandler implements ProductHandler {
    @Override
    public boolean handle(Product product) {
        if (product.getPrice() < 2000) {
            System.out.println(product+" was handled by MidHandler");
            return true;
        }
        return false;
    }
}





