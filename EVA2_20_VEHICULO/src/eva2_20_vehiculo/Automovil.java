package eva2_20_vehiculo;

/**
 *
 * @author danna
 */
public class Automovil extends SuperClase implements ControlVelocidad{
    private String placas;
    private String motor;
    private int gasolina;//litros de gasolina
    
    public Automovil(){
        super();
        this.placas = "7YSH41";
        this.motor = "motor1";
        this.gasolina = 400;
        
    }
    public Automovil(int velocidad, String marca, String placas, String motor, int gasolina) {
        super(velocidad, marca);
        this.placas = placas;
        this.motor = motor;
        this.gasolina = gasolina;
    }

    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getGasolina() {
        return gasolina;
    }

    public void setGasolina(int gasolina) {
        this.gasolina = gasolina;
    }
    

    @Override
    public int acelerar() {
        if(velocidad==100)
            return velocidad;
        else if(velocidad>=0 && velocidad<=100){
            return velocidad+10;
        }
        else{
            return 0;
        }
    }

    @Override
    public int detener() {
        if(velocidad>0 && velocidad<=100)
            return velocidad-10;
        else{
            return 0;
        }
    }

    @Override
    public void imprimirVel() {
        System.out.println("Velocidad de aceleracion: "+ this.acelerar());
        System.out.println("Velocidad de detenimiento: "+ this.detener()+ "\n");
    }

    @Override
    public String toString(){
    String cade = "Datos del automovil: \n"+
                            "Marca: "+ this.getMarca() + "\n"+
                            "Placas: "+ this.getPlacas() + "\n"+
                            "Motor: "+ this.getMotor() + "\n"+
                            "Gasolina: "+ this.getGasolina() + " lts";
        return cade;
    }
}
    
