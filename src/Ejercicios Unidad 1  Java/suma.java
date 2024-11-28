import java.util.Scanner;

public class suma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese numero 1");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese numero 2");
        int num2 = scanner.nextInt();
        System.out.println("Ingrese numero 3");
        int num3 = scanner.nextInt();

        int mayorNumero = mayor(num1, num2, num3);
        System.out.println("El número mayor es: " + mayorNumero);

        scanner.close();
    }

    public static int mayor(int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3) {
            return num1;
        } else if (num2 > num1 && num2 > num3) {
            return num2;
        } else {
            return num3;
        }
    }
}
