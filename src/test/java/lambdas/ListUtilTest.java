package lambdas;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

/**
 * @author Evgeny Borisov
 */
public class ListUtilTest {

    @Test
    public void countDuplicates() {
        List<String> list = asList("java", "Java", "JAVA", "scala", "groovy");

        int count = ListUtil
                .countDuplicates("java", list, (t1, t2) -> t1.equalsIgnoreCase(t2));
        Assert.assertEquals(3,count);
    }
}






