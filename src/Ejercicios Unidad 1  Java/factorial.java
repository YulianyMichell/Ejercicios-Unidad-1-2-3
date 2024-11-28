import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese el numero del que desea el factorial");
        int numero=scanner.nextInt();
        int factorial=1;
        for(int i=1;i<=numero;i++){
            factorial *=i;
        }
        System.out.println("El factotial de " + numero + " es: " + factorial);

        scanner.close();
        }
    }
