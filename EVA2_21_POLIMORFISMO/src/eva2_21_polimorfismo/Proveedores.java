package eva2_21_polimorfismo;

/**
 *
 * @author danna
 */
                //proveedoeres is-a personas
public class Proveedores extends Persona {
        private String rfc;

        public Proveedores() {
            super();
            this.rfc = "---";
        }
        
        public Proveedores(String nombre, String apellido, int edad, String rfc){
            super(nombre, apellido, edad);
            this.rfc = rfc;
        }
        
    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
    
    public void imprimirDatos(){
            super.imprimirDatos();    //PERSONA
            System.out.println("RFC: "+ getRfc());
    }
        
    
}
