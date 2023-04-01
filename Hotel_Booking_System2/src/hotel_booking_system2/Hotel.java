package hotel_booking_system2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Principal
 */
public class Hotel {
    private List<Habitacion> listaHabitaciones = new ArrayList<>();
    private Scanner in = new Scanner (System.in);
            
    public void tipoHabitacion(){
    int opcion = 0;
    boolean salir = false;
    do{
        System.out.println("Menu tipo habitaciones");
        System.out.println("Opcion 1 - Habitacion sencilla");
        System.out.println("Opcion 2 - Habitacion doble");
        System.out.println("Opcion 3 - Habitacion familiar");
        System.out.println("Opcion 4 - Habitacion doble superior");
        System.out.println("Opcion 5 - Suite");
        System.out.println("Opcion 6 - Suite junior");
        opcion = in.nextInt();
        switch (opcion){
            case 1: seleccion(500, "sencilla");
                break;
            case 2: seleccion(1800, "doble");
                break;
            case 3: seleccion(3500, "familiar");
                break;
            case 4: seleccion(4200, "doble superior");
                break;
            case 5: seleccion(7000, "suite");
                break;
            case 6: seleccion(6000, "suite junior");
                break;
        }
                    System.out.println("¿Desea realizar otra reserva? S/N");
                    String estado = in.next().toUpperCase();
                    if (!estado.contentEquals("S")){
                            salir = true;
                    }
            }while (!salir);
    }

            public void seleccion(int precio, String referencia){
                    System.out.println("Introduzca el numero de personas: ");
                    int cantidad = in.nextInt();
                    Persona[] lista = new Persona[cantidad];
                    for (int i = 0; i < lista.length; i++) {
                            System.out.println("Nombre: ");
                            String nombre = in.next();
                            System.out.println("Apellidos: ");
                            String apellidos = in.next();
                            System.out.println("ID: ");
                            String nID = in.next();
                            System.out.println("Edad: ");
                            int edad = in.nextInt();
                            System.out.println("E-mail: ");
                            String email = in.next();
                            System.out.println("Telefono: ");
                            long telefono = in.nextLong();
                            lista[i] = new Persona(nombre, apellidos, nID, edad, email, telefono);
                }
                    
                    listaHabitaciones.add(new Habitacion(referencia, precio, lista));
        
                    for (Habitacion habitacion : listaHabitaciones){
                                    System.out.println(habitacion);
                    }
            
          } 
}
            
            
            