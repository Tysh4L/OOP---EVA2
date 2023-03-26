package eva2_20_vehiculo;

/**
 *
 * @author danna
 */
public class EVA2_20_VEHICULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Automovil auto = new Automovil();
        System.out.println(auto);
        auto.imprimirVel();
        
        Automovil auto2 = new Automovil(100, "KIA", "0VIC701", "motor2", 80);
        System.out.println(auto2);
        auto2.imprimirVel();
        
        Bicicleta bici = new Bicicleta();
        System.out.println(bici);
        bici.imprimirVel();
        
        Bicicleta bici2 = new Bicicleta(30, "Haibike", "urbana", "M");
        System.out.println(bici2);
        bici2.imprimirVel();
        
        
    }
}
