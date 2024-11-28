public class Cuentabancaria {
    public static void main(String[] args) {
        
    int cantidadInicial= 1000;
    int retiroSemana=200;
    int semanas=4;

    int totalRetiros=semanas*retiroSemana;
    int retiroMes= cantidadInicial-totalRetiros;

    System.out.println("La cantidad final de dinero que le queda es:"+retiroMes);
    }

    }
