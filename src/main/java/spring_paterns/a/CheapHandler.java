package spring_paterns.a;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
@Order(1)
public class CheapHandler implements ProductHandler {
    @Override
    public boolean handle(Product product) {
        if (product.getPrice() < 1000) {
            System.out.println(product+" was handled by CheapHandler");
            return true;
        }
        return false;
    }
}





