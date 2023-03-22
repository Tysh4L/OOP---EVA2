package eva2_16_protected;

/**
 *
 * @author danna
 */
public class EVA2_16_PROTECTED {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SuperClase sup = new SuperClase();
        sup.dato = 100;
    }
    
}
class SuperClase{
    protected int dato;
    /*public int getDato(){
        return dato;
    }
    public void setDato(int dato){
        this.dato = dato;
    }*/
}
class SubClase extends SuperClase{
    public void imprimirDato(){
        System.out.println("El valor de dato es: "+ dato);
    }
}
