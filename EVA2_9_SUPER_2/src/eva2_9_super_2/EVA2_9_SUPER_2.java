package eva2_9_super_2;

/**
 *
 * @author danna
 */
public class EVA2_9_SUPER_2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante estudiante = new Estudiante("Danna Paola", "Lopez Flores", 20, "LC22550142");
        estudiante.imprimirDatos();
        //System.out.println("No. de control: "+ estudiante.getnControl());
        
        Docentes docente = new Docentes("Victor", "Gomez Gonzalez", 19, "plazauno");
        docente.imprimirDatos();
        //System.out.println("Plaza: "+ docente.getPlaza());
        
        Proveedores proveedor = new Proveedores("Alan Dirceu", "Rivas Palomino", 19, "RIPA120324");
        proveedor.imprimirDatos();
       // System.out.println("RFC: "+ proveedor.getRfc());
    } 
}
