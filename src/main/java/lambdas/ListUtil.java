package lambdas;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class ListUtil {
    public static <T> int countDuplicates(T t, List<T> list, Equalator<T> equalator) {
        int total = 0;
        for (T t1 : list) {
            if (equalator.equals(t,t1)) {
                total++;
            }
        }
        return total;
    }
}
