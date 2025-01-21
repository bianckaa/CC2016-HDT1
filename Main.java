import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        OsterBlender osterBlender = new OsterBlender();
        Scanner scanner = new Scanner(System.in);

        // Ejemplo de uso de la clase OsterBlender
        boolean lleno = osterBlender.IsFull();
        System.out.println(lleno);
    }
}
