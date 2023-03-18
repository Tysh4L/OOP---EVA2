package eva2_9_super_2;

/**
 *
 * @author danna
 */
                 //Clase Derivada extends Clase Base
                 //Subclase extends Superclase
                //Hijo extends padre
                //estudiante is-a persona
public class Estudiante extends Persona {
        private String nControl;

        
    public Estudiante() {
        super();//llamada al constructor de la superclase
        this.nControl = "----";
    }
   
    public Estudiante(String nombre, String apellido, int edad, String nControl){
        super(nombre, apellido, edad);//llamada al constructor
        this.nControl =  nControl;
    }
    
    //hay que uncluir constructor default y la llamada al constructor de la superclase

    public String getnControl() {
        return nControl;
    }

    public void setnControl(String nControl) {
        this.nControl = nControl;
    }
    
        //@Override: REEMPLAZA  EL METODO (CON LA MISMA FIRMA) EN LA
        //SUPER CLASE, EN ESTE CASO, OCULTAMOS A imprimirDatos() de Persona
    public void imprimirDatos(){
            super.imprimirDatos();    //PERSONA
            System.out.println("No. de control: "+ getnControl());
    }
}
