package eva2_15_tienda;

import SuperClases.Ropa;

/**
 *
 * @author danna
 */
public final class Playera extends Ropa{
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
    public String toString(){
        String cade = "Datos del producto: \n"+
                                "Nombre: "+ this.getNombre() + "\n" +
                                "Precio: "+ this.getPrecio() + "\n" +
                                "Marca: "+ this.getMarca() + "\n" +
                                "Tipo: "+ this.getTipo() + "\n" +
                                "Talla: "+ this.getTalla() + "\n" +
                                "Color: "+ this.getColor() + "\n" +
                                "Unidad: "+ this.getUnidad() + "\n" +
                                "Precio de venta: "+ this.precioVenta(9) + "\n";
        return cade;
    }
    
}
