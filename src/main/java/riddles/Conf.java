package riddles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Evgeny Borisov
 */
@Configuration
public class Conf {
    @Bean
    public CriticalService criticalService(){
        return new CriticalService();
    }

    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("context.xml");
    }
}


