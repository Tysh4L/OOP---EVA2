package eva2_11_override_figuras;

/**
 *
 * @author danna
 */
public class Triangulo extends Figura{
            private double base;
            private double altura;

    public Triangulo() {
        this.base = 6;
        this.altura = 8;
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
            
            @Override
    public double calcularArea(){
            return (base * altura)/2;
    }
    
        @Override
    public double calcularPeri(){
            double lado = ((Math.pow(base, 2))+(Math.pow(altura, 2)));
            return (lado + lado + lado);
    }
            @Override
    public String toString(){
            String cade = "Datos del triangulo: \n" +
                                   "Area: " + this.calcularArea() + "\n" +
                                   "Perimetro: " + this.calcularPeri() + "\n";
            return cade;
    }
}
