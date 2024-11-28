import java.util.Scanner;

public class hardware {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();
        int resultado = numero + 10;
        System.out.println("El resultado es: " + resultado);
        scanner.close(); // Ahora está dentro del método main
    }
}
