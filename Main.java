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
 */
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main (String[] args){
        OsterBlender licuadora = new OsterBlender(0, false);
        boolean salir = false;

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

        int opcion = scanner.nextInt();

        switch(opcion){
            case 1: 
                licuadora.SpeedUp();
                System.out.println("La velocidad se aumento su velocidad actual es: " + licuadora.GetSpeed());
                break;
            case 2:
                if (licuadora.GetSpeed() > 0) {
                            licuadora.SpeedDown();
                            System.out.println("La velocidad disminuyo su velocidad actual es: " + licuadora.GetSpeed());
                        } else {
                            System.out.println("La velocidad ya está en 0.");
                        }
                        break;
            case 3:
                if (!licuadora.IsFull()) {
                            licuadora.Fill();
                            System.out.println("Licuadora llena.");
                        } else {
                            System.out.println("La licuadora ya está llena.");
                        }
                        break;
            case 4:
                if (licuadora.IsFull()) {
                            licuadora.Empty();
                            System.out.println("Licuadora vacia.");
                        } else {
                            System.out.println("La licuadora ya está vacía.");
                        }
                        break;
            case 5:
                if (licuadora.IsFull()) {
                            System.out.println("La licuadora está llena.");
                        } else {
                            System.out.println("La licuadora está vacía.");
                        }
                        break;
                
            case 6:
                System.out.println("la velocidad actual de su licuadora es: " + licuadora.GetSpeed());
                break;

            case 7:
                System.out.println("Saliendo del programa :)");
                salir = true; 
                break;
            }
        }
    }
}