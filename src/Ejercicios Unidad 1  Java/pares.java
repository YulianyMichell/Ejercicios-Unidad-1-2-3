public class pares {
    public static void main(String[] args) {
        // Array de letras de entrada
        String[] letras = {"A", "B", "A", "C", "C", "C", "C"};

        // Llamamos a la función para filtrar los elementos repetidos de manera par
        System.out.println("Elementos con repeticiones pares en letras: " + filtrarElementosPares(letras));
    }

    // Función para filtrar los elementos con repeticiones pares en el array de letras
    public static String filtrarElementosPares(String[] arr) {
        String resultado = "";

        for (int i = 0; i < arr.length; i++) {
            String elemento = arr[i];
            int contador = 0;
            
            // Contamos cuántas veces aparece el elemento en el array
            for (int j = 0; j < arr.length; j++) {
                if (arr[j].equals(elemento)) {  // Usamos '.equals' para comparar el contenido de las cadenas
                    contador++;
                }
            }
            
            // Verificamos si el contador es par y si el elemento aún no se ha agregado a la lista de resultados
            boolean estaEnResultado = false;
            for (int k = 0; k < i; k++) {
                if (arr[k].equals(elemento)) {
                    estaEnResultado = true;
                    break;
                }
            }

            // Si el número de repeticiones es par y el elemento no está ya en el resultado, lo añadimos
            if (contador % 2 == 0 && !estaEnResultado) {
                if (resultado.length() > 0) {
                    resultado += ", ";
                }
                resultado += elemento;
            }
        }

        return resultado;
    }
}
