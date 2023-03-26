package eva2_20_vehiculo;

/**
 *
 * @author danna
 */
public abstract class SuperClase {
     protected int velocidad;
     protected String marca;

    public SuperClase() {
        this.velocidad = 0;
        this.marca = "--";
    }

    public SuperClase(int velocidad, String marca) {
        this.velocidad = velocidad;
        this.marca = marca;
    }
     
     
    public int getVelocidad() {
        return velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
