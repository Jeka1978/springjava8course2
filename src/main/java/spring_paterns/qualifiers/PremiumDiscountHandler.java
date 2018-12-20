package spring_paterns.qualifiers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Premium
public class PremiumDiscountHandler implements DiscountHandler {
    @Override
    public double calc(int price) {
        return Double.MAX_VALUE;
    }
}
