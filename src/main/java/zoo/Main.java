package zoo;

import java.util.stream.IntStream;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();

//        IntStream.range(0,10).forEach(i->animalFactory.createRandom().makeVoice());
        for (int i = 0; i < 10; i++) {
            animalFactory.createRandom().makeVoice();
        }
    }
}
