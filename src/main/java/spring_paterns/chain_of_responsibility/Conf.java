package spring_paterns.chain_of_responsibility;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Evgeny Borisov
 */
@Configuration
@ComponentScan
public class Conf {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Conf.class);
        IDIClientValidator validator = context.getBean(IDIClientValidator.class);
        IDIClient jeka = IDIClient.builder().email("blabla").age(130).build();
        validator.printViolations(jeka);
    }
}





