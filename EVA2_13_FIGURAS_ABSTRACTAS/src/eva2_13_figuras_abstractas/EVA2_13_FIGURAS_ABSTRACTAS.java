package eva2_13_figuras_abstractas;

/**
 *
 * @author danna
 */
public class EVA2_13_FIGURAS_ABSTRACTAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Figura fig = new Figura(); //NO SE PUEDEN CREAR OBJETOS DE FIGURA
        Circulo circu = new Circulo();
        System.out.println(circu);
        Circulo circu2 = new Circulo(3);
        System.out.println(circu2);
        
        Triangulo trian = new Triangulo();
        System.out.println(trian);
        Triangulo trian2 = new Triangulo(3,2);
        System.out.println(trian2);
        
    }
    
}
