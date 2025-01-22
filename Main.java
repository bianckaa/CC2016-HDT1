import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);

    System.out.println("--OPCIONES DE LA LICUADORA--");
    System.out.println("1. Subir velocidad");
    System.out.println("2. Bajar velocidad");
    System.out.println("3. Llenar licuadora");
    System.out.println("4. Vaciar licuadora");
    System.out.println("5. ¿Licuadora llena si/no?");
    System.out.println("salir");


    System.out.println("Por favor escoja una opcion");
    int opcion = scanner.nextInt();

    switch(opcion){
        case 1: 
            subir_velocidad();
            break;
        case 2:
            bajar_velocidad();
            break;
        case 3:
            llenar_licuadora();
            break;
        case 4:
            vaciar_licuadora();
            break;
        case 5:
            licuadora_llena();
            break;
        case 6:
            salir();
            break;
    }
    static void subir_velocidad(){
        System.out.println("Digite la velocidad");
        int numero = scanner.nextInt();

    }
    static void bajar_velocidad(){

    }
    static void llenar_licuadora(){

    }
    static void vaciar_licuadora(){

    }
    static void licuadora_llena(){

    }
}
