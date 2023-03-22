package eva2_18_interfaces_herencia;

/**
 *
 * @author danna
 */
public class EVA2_18_INTERFACES_HERENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

interface intA{
    public abstract void A();
}
interface intB{
     void B();//implicitamente esta incluido el public abstract

}
interface intC extends intA, intB{
    void C();
}
class Prueba implements intC{

    @Override
    public void C() {
       
    }

    @Override
    public void A() {

    }

    @Override
    public void B() {
  
    }

}