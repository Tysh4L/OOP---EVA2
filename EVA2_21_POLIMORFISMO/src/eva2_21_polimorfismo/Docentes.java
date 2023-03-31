package eva2_21_polimorfismo;

/**
 *
 * @author danna
 */
                //docentes is-a personas
public class Docentes extends Persona {
        private String plaza;

        public Docentes() {
            super();
            this.plaza = "---";
        }
        
        public Docentes(String nombre, String apellido, int edad, String plaza){
            super(nombre, apellido, edad);
            this.plaza = plaza;
            
        }
        
    public String getPlaza() {
        return plaza;
    }

    public void setPlaza(String plaza) {
        this.plaza = plaza;
    }
    public void imprimirDatos(){
            super.imprimirDatos();    //PERSONA
            System.out.println("Plazal: "+ getPlaza());
    }
}
