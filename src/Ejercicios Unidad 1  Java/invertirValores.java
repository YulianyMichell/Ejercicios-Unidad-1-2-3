public class invertirValores {

    public static void main(String[] args) {
        // Declaración e inicialización de la matriz imagenGris (ejemplo de imagen en escala de grises)
        int[][] imagenGris = {
            {100, 150, 200},
            {50, 200, 255},
            {0, 50, 100}
        };

        // Invertir el brillo de la imagen (escala de grises)
        for (int i = 0; i < imagenGris.length; i++) {
            for (int j = 0; j < imagenGris[i].length; j++) {
                imagenGris[i][j] = 255 - imagenGris[i][j]; // Invertir el brillo
            }
        }

        // Imprimir la matriz después de invertir los valores
        for (int i = 0; i < imagenGris.length; i++) {
            for (int j = 0; j < imagenGris[i].length; j++) {
                System.out.print(imagenGris[i][j] + " ");
            }
            System.out.println();
        }
    }
}
