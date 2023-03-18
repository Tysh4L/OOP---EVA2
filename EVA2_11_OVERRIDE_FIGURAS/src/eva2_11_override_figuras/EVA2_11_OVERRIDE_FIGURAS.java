package eva2_11_override_figuras;

/**
 *
 * @author danna
 */
public class EVA2_11_OVERRIDE_FIGURAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo circu = new Circulo();
        System.out.println(circu);
        
        Circulo circu2 = new Circulo(5);
        System.out.println(circu2);
   
        
        Triangulo trian = new Triangulo();
        System.out.println(trian);
        
        Triangulo trian2 = new Triangulo(3,9);
        System.out.println(trian2);
   
    
        
    }
    
}

