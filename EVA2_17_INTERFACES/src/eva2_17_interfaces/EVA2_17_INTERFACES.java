package eva2_17_interfaces;

/**
 *
 * @author danna
 */
public class EVA2_17_INTERFACES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //MostrarDatos datos = new MostrarDatos();
        Persona perso = new Persona("Danna", 20);
        perso.imprimirDatos();
        Computadora compu = new Computadora ("Intel i7", 12, 25000, "Computadora");
        compu.imprimirDatos();
 
    }
    
}
