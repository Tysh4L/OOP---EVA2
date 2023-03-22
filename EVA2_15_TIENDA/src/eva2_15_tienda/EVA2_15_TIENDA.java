package eva2_15_tienda;

/**
 *
 * @author danna
 */
public class EVA2_15_TIENDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Computadora compu = new Computadora();
        System.out.println(compu);
        Computadora compu2 = new Computadora(27, 32, "Ryzen 9", "1TB", "ASUS", "UWU", 360, 40000, "PC", "2 pza");
        System.out.println(compu2);
        
        Playera playe = new Playera ();
        System.out.println(playe);
        Playera playe2 = new Playera("S", "Manga larga", "Adidas", "Negro", 900, "Playera", "9 pzas");
        System.out.println(playe2);
    }
    
}
