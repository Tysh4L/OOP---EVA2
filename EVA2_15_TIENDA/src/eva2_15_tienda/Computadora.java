package eva2_15_tienda;

import SuperClases.Electronica;

/**
 *
 * @author danna
 */
public class Computadora extends Electronica{
        private double tamaño; //tamaño de pantalla
        private int memoria;
        private String procesador;
        private String  disco;

    public Computadora() {
        super();
        this.tamaño = 0;
        this.memoria = 0;
        this.procesador = "--";
        this.disco = "--";
    }

    public Computadora(double tamaño, int memoria, String procesador, String disco, String fabricante, String modelo, int garantia, double precio, String nombre, String unidad) {
        super(fabricante, modelo, garantia, precio, nombre, unidad);
        this.tamaño = tamaño;
        this.memoria = memoria;
        this.procesador = procesador;
        this.disco = disco;
    }



    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getDisco() {
        return disco;
    }

    public void setDisco(String disco) {
        this.disco = disco;
    }
        
        
    @Override
    public double precioVenta(int cant) {
        //10 unidades--> el precio es del 80%
        if(cant<10)
            return getPrecio() * cant;
        else
            return(getPrecio() * 0.8) * cant;
    }
    public void imprimirDatos(){
        System.out.println("Datos del producto:");
        System.out.println("Nombre: "+ this.getNombre());
        System.out.println("Fabricante: "+ this.getFabricante());
        System.out.println("Modelo: "+ this.getModelo());
        System.out.println("Garantia: "+ this.getGarantia());
        System.out.println("Precio: "+ this.getPrecio());
        System.out.println("Unidad: "+ this.getUnidad());
        System.out.println("Tamaño: "+ this.getTamaño());
        System.out.println("Memoria: "+ this.getMemoria());
        System.out.println("Procesador: "+ this.getProcesador());
        System.out.println("Disco: "+ this.getDisco());
        System.out.println("Precio de venta: "+ this.precioVenta(9));
    }
    
}
