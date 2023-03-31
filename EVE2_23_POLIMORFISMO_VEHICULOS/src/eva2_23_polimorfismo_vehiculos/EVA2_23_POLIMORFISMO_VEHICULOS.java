package eva2_23_polimorfismo_vehiculos;

/**
 *
 * @author danna
 */
public class EVA2_23_POLIMORFISMO_VEHICULOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

interface datosVehiculo{
    public abstract void acelerar(int cambio);
    public abstract void tablero();
}

class Automovi extends Vehiculo implements datosVehiculo{
    private String modelo;
    private int año;

    public Automovi() {
        super();
        this.modelo = "--";
        this.año = 0;  
    }

    public Automovi(String modelo, int año) {
        this.modelo = modelo;
        this.año = año;
    }

    public Automovi(String modelo, int año, int velocidad, String marca) {
        super(velocidad, marca);
        this.modelo = modelo;
        this.año = año;
    }
    @Override
    public void acelerar(int cambio){
        int cambioVelo = velocidad + cambio;
        
        if (cambioVelo >= 0 ) // aceptar solo velocidad positiva 
        velocidad += cambioVelo; //velocidad = velocidad +cambio <--- acumulador
    }
    public void tablero (){
        System.out.println("Velocidad del automovil: " + getVelocidad());
    }
}

class Vehiculo{
    protected int velocidad;
    private String marca;

    public Vehiculo() {
        this.marca = "---";
        this.velocidad = 0;
    }

    public Vehiculo(int velocidad, String marca) {
        this.velocidad = velocidad;
        this.marca = marca;
    }

    //La velocidad se modifica con acelerar

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

class Bicicleta extends Vehiculo{
    private String tipo;
    private String rodada;

    public Bicicleta() {
        super();
    }
    
    
    



}