package zoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

/**
 * @author Evgeny Borisov
 */
public class AnimalFactory {
    private List<Supplier<Animal>> animalSuppliers = new ArrayList<>();

    public AnimalFactory() {
        animalSuppliers.add(Dog::new);
        animalSuppliers.add(Cat::new);

    }

    public Animal createRandom() {
        Random random = new Random();
        int i = random.nextInt(animalSuppliers.size());
        Supplier<Animal> supplier = animalSuppliers.get(i);
        return supplier.get();


    }
}
