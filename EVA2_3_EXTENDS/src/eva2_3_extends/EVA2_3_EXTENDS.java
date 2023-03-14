package eva2_3_extends;

/**
 *
 * @author danna
 */
public class EVA2_3_EXTENDS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante estu = new Estudiante();
        estu.setNombre("Danna");
        estu.setApellido("Lopez");
        estu.setEdad(20);
        estu.setnControl("C22550142");
        
        System.out.println("IMPRIMIR DATOS");
        System.out.println("Nombre: "+ estu.getNombre());
        System.out.println("Apellido: "+ estu.getApellido());
        System.out.println("Edad: "+ estu.getEdad());
        System.out.println("No. de control: "+ estu.getnControl());
        
        Proveedores prove = new Proveedores();
       prove.setNombre(" ");
       prove.setApellido(" ");
       prove.setEdad(11);
       prove.setRfc("jsjsads");
       
        System.out.println("Nombre: "+ prove.getNombre());
        System.out.println("Apellido: "+ prove.getApellido());
        System.out.println("Edad: "+ prove.getEdad());
        System.out.println("RCF: "+ prove.getRfc());
        
    }
    
}
