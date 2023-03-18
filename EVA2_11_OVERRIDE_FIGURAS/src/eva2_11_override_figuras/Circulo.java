package eva2_11_override_figuras;

/**
 *
 * @author danna
 */
public class Circulo extends Figura{
        private double radio;

    public Circulo() {
        this.radio = 0;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
        
        @Override
    public double calcularArea(){
            return Math.PI * (radio * radio);
    }
    
        @Override
    public double calcularPeri(){
            return Math.PI * (radio * 2);
    }
     @Override
    public String toString(){
            String cade = "Datos del circulo: \n" +
                                   "Area: " + this.calcularArea() + "\n" +
                                   "Perimetro: " + this.calcularPeri() + "\n";
            return cade;
    }
}
