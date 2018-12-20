package spring_paterns.lazy_singleton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
@Service
public class MyService {
    @Autowired
    private Dao dao;

    @Autowired
    @Lazy
    private BackupServiceWhichShouldNotBeUsed backupService;

    public MyService() {
        System.out.println("my service constructor is working");
    }

    @PostConstruct
    public void init() {
        System.out.println(backupService.getClass());
        System.out.println("my service init method is working");
    }

    @EventListener(ContextRefreshedEvent.class)
    public void doWork() {
        try {
            dao.saveData("my data");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            backupService.saveData("my data");
        }
    }












}
