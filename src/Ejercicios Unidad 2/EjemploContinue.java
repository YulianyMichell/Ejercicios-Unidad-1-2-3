public class EjemploContinue {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue; // Salta la impresión de números pares
            }
            System.out.println(i);  // Imprime solo los números impares
        }
    }
}
