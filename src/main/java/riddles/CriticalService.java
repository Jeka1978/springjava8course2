package riddles;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
@Service
public class CriticalService {
    @PostConstruct
    public void init(){
        System.out.println(123);
    }
}
