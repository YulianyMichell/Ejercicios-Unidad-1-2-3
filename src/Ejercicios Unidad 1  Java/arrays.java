import java.util.Scanner;
public class arrays {
    public static void main(String[]args){
    

    int numeros []=new int[5];
    int suma=0;
    Scanner scanner=new Scanner(System.in);

    for (int i=0;i<numeros.length;i++){
        
    System.out.println("Ingrese un número");
    numeros[i]=scanner.nextInt();
    suma +=numeros[i];
    }
    double promedio=suma/(double) numeros.length;
    System.out.println("El promedio es promedio:"+promedio);

    scanner.close();

    }
    
}
