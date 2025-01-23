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
 * Clase principal del programa que permite al usuario interactuar con una licuadora marca Oster. 
 */
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    /**
     * Método principal que inicia el programa y maneja el menú de opciones.
     * Permite al usuario interactuar con la licuadora mediante las opciones disponibles en el menú.
     * El programa continuará ejecutándose hasta que el usuario seleccione la opción para salir.
     *
     * @param args Argumentos de línea de comandos (no utilizados en este caso).
     */
    public static void main (String[] args){
        OsterBlender licuadora = new OsterBlender(0, false);
        boolean salir = false; // Variable para controlar el ciclo del menu de ocpiones

        while (!salir) {
            System.out.println();
            System.out.println("╔═══════════════════════════════════════╗");
            System.out.println("║            Licuadora Oster            ║");
            System.out.println("╠═══════════════════════════════════════╣");
            System.out.println("║  1. Subir velocidad                   ║");
            System.out.println("║  2. Bajar velocidad                   ║");
            System.out.println("║  3. Llenar licuadora                  ║");
            System.out.println("║  4. Vaciar licuadora                  ║");
            System.out.println("║  5. ¿Licuadora llena?                 ║");
            System.out.println("║  6. Velocidad actual                  ║");
            System.out.println("║  7. Salir                             ║");
            System.out.println("╚═══════════════════════════════════════╝");
            System.out.print("Seleccione una opción (^-^)/: ");
            System.out.println();

            int opcion = scanner.nextInt();

            switch(opcion){
                case 1: 
                    licuadora.SpeedUp();
                    System.out.println("¡Velocidad aumentada ^o^ !");
                    System.out.println("Su velocidad actual es " + licuadora.GetSpeed());
                    break;
                case 2:
                    if (licuadora.GetSpeed() > 0) {
                                licuadora.SpeedDown();
                                System.out.println("¡Velocidad disminuida ^o^ !");
                                System.out.println("Su velocidad actual es: " + licuadora.GetSpeed());
                            } else {
                                System.out.println("La velocidad ya está en 0 (._.).");
                            }
                            break;
                case 3:
                    if (!licuadora.IsFull()) {
                                licuadora.Fill();
                                System.out.println("¡Licuadora llena ^o^ !");
                            } else {
                                System.out.println("La licuadora ya está llena (._.).");
                            }
                            break;
                case 4:
                    if (licuadora.IsFull()) {
                                licuadora.Empty();
                                System.out.println("¡Licuadora vacia ^o^ !");
                            } else {
                                System.out.println("La licuadora ya está vacía (._.).");
                            }
                            break;
                case 5:
                    if (licuadora.IsFull()) {
                                System.out.println("Sí, la licuadora si está llena ^o^.");
                            } else {
                                System.out.println("No, la licuadora no está llena (._.).");
                            }
                            break;
                    
                case 6:
                    System.out.println("La velocidad actual de su licuadora es: " + licuadora.GetSpeed());
                    break;

                case 7:
                    System.out.println("Saliendo del programa :)");
                    salir = true; 
                    break;
                }
        }
    }
}