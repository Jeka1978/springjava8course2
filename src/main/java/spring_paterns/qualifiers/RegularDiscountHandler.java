package spring_paterns.qualifiers;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Regular
public class RegularDiscountHandler implements DiscountHandler {
    @Override
    public double calc(int price) {
        return price * 0.1;
    }
}
