import java.util.Scanner;
public class numeroPrimo {
    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num=scanner.nextInt();
        boolean esprimo=true;

        for (int i=2;i<num;i++){
            if(num%i==0){
                esprimo=false;
            }
        }

        scanner.close();
        System.out.println("Es un numero primo? "+ esprimo);

        System.out.println("Son numeros primeros entre 1 y 100");
        for (int numero=2;numero<=100;numero++){
            boolean esPrimo1y100=true;

            for (int i=2;i<numero;i++){
                if(numero%i==0){
                esPrimo1y100=false;
                    
                }
            }

            if(esPrimo1y100){
                System.out.print(numero+" ");
                }
        }
    }
}