package MisClases;

/**
 *
 * @author danna
 */
public class Tv {
    private int canal;
    private int volumen;
    private boolean power;

//metodos set
public void setCanal(int canalTv){
    canal = canalTv;
}
public void setVolumen(int volumenTv){
    volumen = volumenTv;
}
public void setPower(boolean powerTv){
    power = powerTv;
}
//metodos get
public int getCanal(){
    return canal;
}
public int getVolumen(){
    return volumen;
}
public boolean getPower(){
    return power;
}
public void imprimirDatos(){
    System.out.println("Datos: ");
    System.out.println("Canal: "+ canal);
    System.out.println("Volumen: "+ volumen);
    System.out.println("Power: "+ power);
}    
}
