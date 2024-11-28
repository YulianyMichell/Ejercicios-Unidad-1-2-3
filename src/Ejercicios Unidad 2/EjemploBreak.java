public class EjemploBreak {

    public static void main(String[] args) {
        // Ciclo for con break para detener cuando i sea igual a 5
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; // Sale del ciclo cuando i es igual a 5
            }
            System.out.println(i); // Imprime el valor de i
        }
    }
}
