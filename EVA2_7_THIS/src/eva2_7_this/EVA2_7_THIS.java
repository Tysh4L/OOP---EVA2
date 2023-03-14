package eva2_7_this;

/**
 *
 * @author danna
 */
public class EVA2_7_THIS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //imprimir();
        //this no se puede usar en un contexto estatico
    }
    public void imprimir(){
        //aqui tambien es visible this
    }
    
}
//this es una referencia a una instancia de la clase(crear objeto antes para poder usar this)
//todos los objetos tienen this
//pueden usar this en cualquier clase
class Persona{
        private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
        //thus.nombre es el atributo de la clase
        //nombre es la variable (parametro) declarada en el metodo
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void imprimirDatos(){
        System.out.println("El nombre es: "+ this.nombre);
    }
}
