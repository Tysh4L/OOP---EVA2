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
        compu.imprimirDatos();
        Computadora compu2 = new Computadora(27, 32, "Ryzen 9", "1TB", "ASUS", "UWU", 360, 40000, "PC GAMER xQUIRU", "9 pza");
        compu2.imprimirDatos();
        
        Playera playe = new Playera ();
        playe.imprimirDatos();
        Playera playe2 = new Playera("S", "Manga larga", "Adidas", "Negro", 900, "Playeradidas777", "2 pzas");
        playe2.imprimirDatos();
    }
    
}
