package eva2_21_polimorfismo;

/**
 *
 * @author danna
 */
public class EVA2_21_POLIMORFISMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante estu = new Estudiante("Danna", "Lopez", 21, "LC22550142");
        estu.imprimirDatos();

        
        Docentes docente = new Docentes();
        docente.setNombre("Martina");
        docente.setApellido("Chavez");
        docente.setPlaza("Tiempo completo");
        docente.setEdad(22);
        docente.imprimirDatos();
        //PUEDO TRATAR A LOS OBJETOS DE LAS SUBCLASES
        //COMO OBJETOS DE LA SUPERCLASE
        //AL REVES NO SE PUEDE
        //ESTOY ASIGNANDO UN OBJETO DE TIPO ESTUDIANTE Y LO
        //ESTOY ASIGNANDO A UNA VARIABLE DE TIPO PERSONA
       Persona persp = estu;
       //ESTOY GENERALIZANDO (SIMPLIFICANDO)
       //perso.
       Persona perso2 = docente;
       Persona perso3 = new Persona();
       //Es imposible convertir a una persona en un estudiante
       //no podemos agregar cosas, simplemente ocultamos
       //propiedades
       Estudiante estudiante = perso3;
    }
    
}
