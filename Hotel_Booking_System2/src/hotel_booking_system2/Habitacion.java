package hotel_booking_system2;

import java.util.Arrays;
/**
 *
 * @author Principal
 */
public class Habitacion {
    private String referencia;
    private int precio;
    private Persona[] listaPersonas;

    public Habitacion(String referencia, int precio, Persona[] listaPersonas) {
        this.referencia = referencia;
        this.precio = precio;
        this.listaPersonas = listaPersonas;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Persona[] getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(Persona[] listaPersonas) {
        this.listaPersonas = listaPersonas;
    }
    
    @Override
      public String toString(){
            
            return "Datos de habitacion:\n Precio: " + precio + "\n "+ "Datos: " + Arrays.asList(listaPersonas);
            
        }
    
    
}
