package eva2_14_clases_abstractas;

/**
 *
 * @author danna
 */
public class Estudiante extends Persona{
        private String ncontrol;

        public Estudiante() {
            super();
            this.ncontrol = "C22550143";
        }

        public Estudiante(String ncontrol, String nombre, int edad) {
            super(nombre, edad);
            this.ncontrol = ncontrol;
        }

        public String getNcontrol() {
            return ncontrol;
        }

        public void setNcontrol(String ncontrol) {
            this.ncontrol = ncontrol;
        }
        
        
    
        
    @Override
    public void imprimirDatos() {
        System.out.println("Datos del estudiante:");
        System.out.println("Nombre: "+ this.getNombre());
        System.out.println("Edad: "+ this.getEdad());
        System.out.println("No. de control: "+ this.getNcontrol());
    }
}
