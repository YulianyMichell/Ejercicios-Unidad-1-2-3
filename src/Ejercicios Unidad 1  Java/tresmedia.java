import java.util.Scanner;
public class tresmedia {

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);

        System.out.println("Introduce la temperatura del primer dia ");
        double temp1=sc.nextDouble();

        System.out.println("Introduce la temperatura del segundo dia ");
        double temp2=sc.nextDouble();

        System.out.println("Introduce la temperatura del tercer dia");
        double temp3= sc.nextDouble();

        double media=(temp1+temp2+temp3)/3;

        System.out.println("El resultado de la media de las tres temperaturas es:"+media);

        sc.close();

    }
}
