package spring_paterns.lazy_singleton;

import org.springframework.stereotype.Repository;

import java.util.Random;

/**
 * @author Evgeny Borisov
 */
@Repository
public class DaoImpl implements Dao {
    @Override
    public void saveData(Object o) {
        System.out.println("data was saved "+o);
        Random random = new Random();
        if (random.nextBoolean()) {
            throw new RuntimeException("Sybase is too old...");
        }
    }
}
