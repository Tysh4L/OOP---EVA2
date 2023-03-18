package eva2_14_clases_abstractas;

/**
 *
 * @author danna
 */
public abstract class Persona {
        private String nombre;
        private int edad;

    public Persona() {
        this.nombre = "Alan";
        this.edad = 19;
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    //LOS METODOS ABSTRACTOS PUEDEN COEXISTIR CON METODOS NORMALES    
    public abstract void imprimirDatos();
}
