package spring_paterns.qualifiers.a;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

/**
 * @author Evgeny Borisov
 */
@Repository
@Primary
public class MockDaoStam implements Dao {
    @Override
    public void save() {
        System.out.println("Mock and Stam");
    }
}
