package spring_paterns.lazy_singleton;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
@Service
@Lazy
public class BackupServiceWhichShouldNotBeUsed {
    @PostConstruct
    public void init() {
        System.out.println("BackupDadWhichShouldNotBeUsed was created");
    }

    public void saveData(Object o) {
        System.out.println(o+" was saved to ORACLE");
    }

}
