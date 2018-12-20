package spring_paterns.a;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Service
public class MainProductHandler {
    @Autowired
    private List<ProductHandler> handlers;

    public void handleProduct(Product product) {
        for (ProductHandler handler : handlers) {
            boolean wasHandled = handler.handle(product);
            if (wasHandled) {

                break;
            }
        }
    }


    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("spring_paterns.a");
        MainProductHandler handler = context.getBean(MainProductHandler.class);
        Product polica = new Product("polica", 100);
        handler.handleProduct(polica);
    }




}
