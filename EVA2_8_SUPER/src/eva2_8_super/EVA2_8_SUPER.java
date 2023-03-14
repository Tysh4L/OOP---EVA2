package eva2_8_super;

/**
 *
 * @author danna
 */
public class EVA2_8_SUPER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Animal animal = new Animal("jsjsads", 80);
       Mamifero mamifero = new Mamifero("rosa", "owo",  77);
       Canes can = new Canes();
    }  
}

class Animal{
        private String nombre;
        private int peso;
        
        public Animal(){
            System.out.println("ITS ALIVE!!");
        }
        
        public Animal(String nombre, int peso) {
            this.nombre = nombre;
            this.peso = peso;
            System.out.println("ITS ALIVE!! constructor 2");
        }
        
        public void respirar(){
            System.out.println("Estoy respirando");
        }

        
        
    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
        
}
class Mamifero extends Animal{
        private String colorPelo;
        public Mamifero(){
        //super --> referenciador constructores y a metodos, super clase
        //lo primero a llamar en un constructor es llamar al constructor de la super clase
            super();//llamada al constructor default
            System.out.println("Soy un mamifero!!");
        }


        public Mamifero(String colorPelo, String nombre, int peso) {
            //super --> apuntador a la superclase
            //el primer constructor
            super(nombre, peso);//lamada al constructor de la super clase
            this.colorPelo = colorPelo;
            System.out.println("Soy un mamifero! constructor 2");
        }
        
        public String getColorPelo() {
            return colorPelo;
        }

        public void setColorPelo(String colorPelo) {
            this.colorPelo = colorPelo;
        }
        
 }
        class Canes extends Mamifero {

            public Canes() {
                super();
                System.out.println("Soy un can!!");
         }
        
}