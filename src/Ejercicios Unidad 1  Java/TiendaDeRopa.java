public class TiendaDeRopa {
    
    public static void main(String[] args) {   
int precioCamisa=25;
int precioPantalon=30;
double descuento85=0.85;
double descuento5=0.05;


double totalSuma=precioCamisa+precioPantalon;
double totalCompra=totalSuma*descuento85;

System.out.println("El precio de una camisa y un pantalon con el 15% es: "+totalCompra);
double precioCamisa2=(precioCamisa*descuento85)*(1-descuento5);

System.out.println("El precio de la segunda camisa es:"+precioCamisa2);


}
    }

