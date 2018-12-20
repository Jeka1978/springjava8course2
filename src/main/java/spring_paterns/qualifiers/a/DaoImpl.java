package spring_paterns.qualifiers.a;

import org.springframework.stereotype.Repository;

import static spring_paterns.qualifiers.a.DBType.MONGO;
import static spring_paterns.qualifiers.a.DBType.SYBASE;

/**
 * @author Evgeny Borisov
 */
@IDIDao(MONGO)
public class DaoImpl implements Dao {
    @Override
    public void save() {
        System.out.println("Saving to Mongo");
    }
}
