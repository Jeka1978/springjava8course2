package multiple_iheritance;

/**
 * @author Evgeny Borisov
 */
public interface Mother {
   default void speak(){
       System.out.println("COME TO ME MY SON!!!");
   }
}
