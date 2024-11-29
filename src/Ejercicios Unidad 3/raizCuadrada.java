    class NumeroNegativoException extends Exception {
        public NumeroNegativoException(String mensaje) {
            super(mensaje);
        }
    }
    
    public class raizCuadrada {
        public static void main(String[] args) {
            try {
                double numero = -9; // Prueba con números negativos
                if (numero < 0) {
                    throw new NumeroNegativoException("No se puede calcular la raíz cuadrada de un número negativo.");
                }
                System.out.println("La raíz cuadrada de " + numero + " es " + Math.sqrt(numero));
            } catch (NumeroNegativoException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
    

