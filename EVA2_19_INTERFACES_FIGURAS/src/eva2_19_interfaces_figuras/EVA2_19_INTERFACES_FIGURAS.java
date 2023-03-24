package eva2_19_interfaces_figuras;

/**
 *
 * @author danna
 */
public class EVA2_19_INTERFACES_FIGURAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //NO SE PUEDEN INSTANCIAR
        //Figuras figura = new Figuras();
        //MostrarDatos mostrar = new MostrarDatos();
        Circulo circu = new Circulo(20);
        circu.imprimirDatos();
        
        Triangulo trian = new Triangulo();
        trian.setBase(20);
        trian.setAltura(20);
        trian.imprimirDatos();
    }
    
}
