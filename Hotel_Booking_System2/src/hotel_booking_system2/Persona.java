package hotel_booking_system2;

/**
 *
 * @author Principal
 */
public class Persona {
        private String nombre;
        private String apellidos;
        private String nID;
        private int edad;
        private String email;
        private long telefono;

    public Persona(String nombre, String apellidos, String nID, int edad, String email, long telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nID = nID;
        this.edad = edad;
        this.email = email;
        this.telefono = telefono;
    }
        
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getnID() {
        return nID;
    }

    public void setnID(String nID) {
        this.nID = nID;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
        
        
        @Override
        public String toString(){
            
            return "Huesped:\nNombre: " + nombre + " " + apellidos + "\n" + "ID: " + nID + "\n" + 
                       "Edad: " + edad + "\n" + "Email: " + email + "\n" + "Telefono: " + telefono;
            
        }
        
        
    
}
