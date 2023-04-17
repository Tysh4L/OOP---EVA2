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
        Automovil auto = new Automovil("UWU", 2023, 0, "KIA");
        CambiarVelocidad(auto, 30);
        
        Bicicleta bici = new Bicicleta("montaña", "XX",  0, "Harley Davidson");
        CambiarVelocidad(bici, 55);
    }
    
    public static void CambiarVelocidad (DatosVehiculo vehi, int vel){
        vehi.acelerar(vel);
        vehi.tablero();
    
    }
    
}

interface DatosVehiculo{
    public abstract void acelerar(int cambio);
    public abstract void tablero();
}

class Automovil extends Vehiculo implements DatosVehiculo{
    private String modelo;
    private int año;

    public Automovil() {
        super();
        this.modelo = "--";
        this.año = 0;  
    }

    public Automovil(String modelo, int año, int velocidad, String marca) {
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

class Bicicleta extends Vehiculo implements DatosVehiculo{
    private String tipo;
    private String rodada;

    public Bicicleta() {
        super();
        this.tipo = "--";
        this.rodada = "--";
    }

    public Bicicleta(String tipo, String rodada) {
        this.tipo = tipo;
        this.rodada = rodada;
    }

    public Bicicleta(String tipo, String rodada, int velocidad, String marca) {
        super(velocidad, marca);
        this.tipo = tipo;
        this.rodada = rodada;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRodada() {
        return rodada;
    }

    public void setRodada(String rodada) {
        this.rodada = rodada;
    }
    
    

    @Override
    public void acelerar(int cambio) {
             int cambioVelo = velocidad + cambio;
        
        if (cambioVelo >= 0 ) // aceptar solo velocidad positiva 
        velocidad += cambioVelo; //velocidad = velocidad +cambio <--- acumulador
      
    }

    @Override
    public void tablero() {
        System.out.println("Velocidad de la bicicleta: " + getVelocidad());
        
    }
    
    
    



}