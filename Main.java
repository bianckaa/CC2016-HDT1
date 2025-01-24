/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos - Seccion 31
 * Hoja de Trabajo No.1
 * Integrantes:
 * Biancka Raxón 24960
 * Diana Sosa 241040
 * Ivana Figueroa 24785
 * 
 * 
 * Clase: Main
 * Clase principal del programa
 * Controlar la logica de funcionamiento del menu para que se pueda interactuar con el usuario
 */
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main (String[] args){

        // Crear la instancia de OsterBlender con velocidad inicial 0 y vací
        OsterBlender licuadora = new OsterBlender(0, false);
        // Variable para controlar la salida del programa.
        boolean salir = false;



    // Ciclo para mostrar el menú hasta que el usuario decida salir con las opciones indicadas.
    while (!salir) {
    System.out.println("--OPCIONES DE LA LICUADORA--");
    System.out.println("1. Subir velocidad");
    System.out.println("2. Bajar velocidad");
    System.out.println("3. Llenar licuadora");
    System.out.println("4. Vaciar licuadora");
    System.out.println("5. ¿Licuadora llena si/no?");
    System.out.println("6. velocidad actual");
    System.out.println("7. Salir");
    System.out.println("Por favor escoja una opcion");

    
     // Leer la opción seleccionada por el usuario.
    int opcion = scanner.nextInt();

    switch(opcion){
        case 1: //subir su velocidad
            licuadora.SpeedUp();
               System.out.println("La velocidad se aumento su velocidad actual es: " + licuadora.GetSpeed());
            break;
        case 2://bajar su velocidad
            if (licuadora.GetSpeed() > 0) {
                        licuadora.SpeedDown();
                        System.out.println("La velocidad disminuyo su velocidad actual es: " + licuadora.GetSpeed());
                    } else {
                        System.out.println("La velocidad ya está en 0.");
                    }
                    break;
        case 3://accion de llenar la licuadora
            if (!licuadora.IsFull()) {
                        licuadora.Fill();
                        System.out.println("Licuadora llena.");
                    } else {
                        System.out.println("La licuadora ya está llena.");
                    }
                    break;
        case 4://accion de vaciar la licuadora
            if (licuadora.IsFull()) {
                        licuadora.Empty();
                        System.out.println("Licuadora vacia.");
                    } else {
                        System.out.println("La licuadora ya está vacía.");
                    }
                    break;
        case 5://devolver si la licuadora esta llena o no
            if (licuadora.IsFull()) {
                        System.out.println("La licuadora está llena.");
                    } else {
                        System.out.println("La licuadora está vacía.");
                    }
                    break;
            
        case 6://devolver el valor de la velocidad actual de la licuadora
            System.out.println("la velocidad actual de su licuadora es: " + licuadora.GetSpeed());
            break;

        case 7://finalizar con el programa
            System.out.println("Saliendo del programa :)");
            salir = true; 
            break;

        default://respuesta ante una opcion no valida
        System.out.println("Opción no válida.");
        break;
        
     }
   }
   //cierre de scanner al antes de finalizar el programa
   scanner.close();
   System.out.println("Programa finalizado.");
 }
}