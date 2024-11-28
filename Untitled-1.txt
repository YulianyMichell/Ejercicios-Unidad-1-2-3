import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(Syste,.in);
        System.out.println("Ingrese el primer numero")
        int num_1= sc.nextInt();
        System.out.println("Ingrese el segundo numero")
        int num_2= sc.nextInt();

        int suma=num_1+num_2;
        int resta=num_1-num_2;
        int multiplicacion=num_1*num_2;
        int division=num_1/num_2;
        int modulo=num_1%num_2;

        System.out.println("El resultado de la suma es:"+suma);
        System.out.println("El resultado de la resta es:"+resta);
        System.out.println("El resultado de la multiplicacion es:"+multiplicacion);
        System.out.println("El resultado de la division es:"+division);
        System.out.println("El resultado de modulo es:"+modulo);

    }
}