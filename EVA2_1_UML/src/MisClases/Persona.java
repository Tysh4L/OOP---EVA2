package MisClases;

/**
 *
 * @author danna
 */
public class Persona {
    private int ID;
    private String nombre;
    private int edad;

//metodos set
public void setID(int idPersona){
    ID = idPersona;
}
public void setNombre(String nombrePersona){
    nombre = nombrePersona;
}
public void seEdadt(int edadPersona){
    edad = edadPersona;
}
//metodos get
public int getID(){
    return ID;
}
public String getNombre(){
    return nombre;
}
public int getEdad(){
    return edad;
}
public void imprimirDatos(){
    System.out.println("Datos: ");
    System.out.println("ID: "+ ID);
    System.out.println("Nombre: "+ nombre);
    System.out.println("Edad: "+ edad);
}
}
