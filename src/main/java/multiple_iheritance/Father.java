package multiple_iheritance;

/**
 * @author Evgeny Borisov
 */
public interface Father  {
   default void speak(){
       System.out.println("Come to me my son");
   }
}
