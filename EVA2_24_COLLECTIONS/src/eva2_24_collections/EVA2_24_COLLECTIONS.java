package eva2_24_collections;

import java.util.ArrayList;

public class EVA2_24_COLLECTIONS {

    public static void main(String[] args) {
        //collection ---> contenedores
        ArrayList miArreglo = new ArrayList(); //Guardamos el objeto
        miArreglo.add(new Persona());
        miArreglo.add(new Automovil());
        miArreglo.add(new Perro());
        
        ArrayList<Integer> miArreglo2 = new ArrayList<Integer>(); //Guardamos
        miArreglo2.add(100);
        miArreglo2.add(200);
        miArreglo2.add(300);
        miArreglo2.add(400);
            System.out.println(miArreglo2);
    }
    
}

class Persona{
}

class Automovil{
}

class Perro{
}