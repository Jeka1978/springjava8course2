package spring_paterns.qualifiers.a;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
@Service
public class DBService {
    @IDIDao(DBType.MONGO)
    private Dao mainDao;
    @IDIDao(DBType.SYBASE)
    private Dao backupDao;

    @Autowired
    private Dao stam;

    @PostConstruct
    public void init(){
        stam.save();
    }



    @Scheduled(fixedDelay = 500)
    public void work() {
        System.out.println("working...");
        mainDao.save();
    }

    @Scheduled(fixedDelay = 1500)
    public void backup() {
        System.out.println("backuping...");
        backupDao.save();
    }














}






