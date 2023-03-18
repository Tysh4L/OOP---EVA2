package eva2_14_clases_abstractas;

/**
 *
 * @author danna
 */
public class EVA2_14_CLASES_ABSTRACTAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Estudiante estu = new Estudiante();
       estu.imprimirDatos();
       Estudiante estu2 = new Estudiante("C22550142", "Danna", 20);
       estu2.imprimirDatos();
        
    }
    
}
