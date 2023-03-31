package Paquete2;

import Paquete1.ClaseA;
import Paquete1.ClaseC;

/**
 *
 * @author danna
 */
public class ClaseE {
    public int publicE;
    int defaultE;
    private int privateE;
    
    public void prueba(){
    ClaseA objA = new ClaseA();
        //objA.publicA;
    
    //ClaseB objB = new ClaseB(); Es invisible por ser clase default y estar en otro paquete
    
    ClaseC objC = new ClaseC();
        //objC.publicC;
        
    //ClaseD objD = new ClaseD(); Es invisible por ser clase default y estar en otro paquete
    }
}

class ClaseF{
    public int publicF;
    int defaultF;
    private int privateF;

}