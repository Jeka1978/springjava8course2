package multiple_iheritance;

/**
 * @author Evgeny Borisov
 */
public class Daughter implements Father,Mother {
    @Override
    public void speak() {
        Father.super.speak();
        Mother.super.speak();
        System.out.println();
    }
}
