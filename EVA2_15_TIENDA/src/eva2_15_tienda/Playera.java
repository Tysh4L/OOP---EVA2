package eva2_15_tienda;

import SuperClases.Ropa;

/**
 *
 * @author danna
 */
public class Playera extends Ropa{
        private String talla;
        private String tipo;

    public Playera() {
        super();
        this.talla = "--";
        this.tipo = "--";
    }

    public Playera(String talla, String tipo, String marca, String color, double precio, String nombre, String unidad) {
        super(marca, color, precio, nombre, unidad);
        this.talla = talla;
        this.tipo = tipo;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
        @Override
    public double precioVenta(int cant) {
        //10 unidades--> el precio es del 80%
        if(cant<10)
            return getPrecio() * cant;
        else
            return(getPrecio() * 0.8) * cant;
    }
    
    @Override
    public void imprimirDatos(){
        System.out.println("Datos del producto:");
        System.out.println("Nombre: "+ this.getNombre());
        System.out.println("Tipo: "+ this.getTipo());
        System.out.println("Marca: "+ this.getMarca());
        System.out.println("Talla: "+ this.getTalla());
        System.out.println("Precio: "+ this.getPrecio());
        System.out.println("Unidad: "+ this.getUnidad());
        System.out.println("Precio de venta: "+ this.precioVenta(2));
    }
    
}
