package eva2_6_colisiones_constructor;

/**
 *
 * @author danna
 */
                                    //mamifero is-a
public class Mamifero extends Animal {
    
        public Mamifero(){
            System.out.println("Soy un mamifero");
         }
    
        public void parir(){
            System.out.println("No nacemos de huevos");
        }
        public void pelo(){
            System.out.println("Tengo pelo");
        }
}
