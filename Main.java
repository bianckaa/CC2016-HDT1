import java.util.Scanner;

public class Main {
<<<<<<< HEAD
    Scanner scanner = new Scanner(System.in);

    System.out.println("--OPCIONES DE LA LICUADORA--");
    System.out.println("1. Subir velocidad");
    System.out.println("2. Bajar velocidad");
    System.out.println("3. Llenar licuadora");
    System.out.println("4. Vaciar licuadora");
    System.out.println("5. ¿Licuadora llena si/no?");
    System.out.println("Por favor escoja una opcion");
    
    
=======
    public static void main(String[] args) {
        OsterBlender osterBlender = new OsterBlender();
        Scanner scanner = new Scanner(System.in);

        // Ejemplo de uso de la clase OsterBlender
        boolean lleno = osterBlender.IsFull();
        System.out.println(lleno);
    }
>>>>>>> cd3f154c913861cda35a3455ffe9eea701a27b3a
}
