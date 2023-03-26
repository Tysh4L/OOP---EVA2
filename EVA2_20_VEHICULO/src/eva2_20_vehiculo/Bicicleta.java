package eva2_20_vehiculo;

/**
 *
 * @author danna
 */
public class Bicicleta extends SuperClase implements ControlVelocidad{
    private String tipo;
    private String talla;

    public Bicicleta() {
        super();
        this.tipo = "De montaña";
        this.talla = "XS"; //XS, X, M, L, XL
    }

    public Bicicleta(int velocidad, String marca, String tipo, String talla) {
        super(velocidad, marca);
        this.tipo = tipo;
        this.talla = talla;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTalla() {
        return talla;
    }

    public void setTamaño(String tamaño) {
        this.talla = talla;
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
    String cade = "Datos la bicicletal: \n"+
                            "Marca: "+ this.getMarca() + "\n"+
                            "Tipo: "+ this.getTipo() + "\n"+
                            "Talla: "+ this.getTalla();
        return cade;
    }
    
}
