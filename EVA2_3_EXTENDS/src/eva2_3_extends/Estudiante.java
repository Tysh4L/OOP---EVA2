package eva2_3_extends;

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

    public String getnControl() {
        return nControl;
    }

    public void setnControl(String nControl) {
        this.nControl = nControl;
    }
}
