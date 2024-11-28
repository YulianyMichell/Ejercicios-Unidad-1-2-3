public class estadoTablero {

    public static void main(String[] args) {
        // Declaración e inicialización de la matriz tablero
        int[][] tablero = {
            {1, 0, 1},
            {0, 1, 0},
            {1, 0, 1}
        };

        // Imprimir el estado del tablero
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }
}
