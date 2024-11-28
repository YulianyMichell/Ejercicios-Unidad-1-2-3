public class productos {
    public static void main(String[] args) {
        // Declaración de la matriz de precios
        double[][] precios = {
            {10.5, 20.0, 15.0},
            {5.0, 7.5, 8.0},
            {12.0, 14.0, 11.5}
        };

        // Cálculo del promedio de precios por producto
        for (int i = 0; i < precios.length; i++) {
            double suma = 0;
            for (int j = 0; j < precios[i].length; j++) {
                suma += precios[i][j];
            }
            System.out.println("El promedio de precios del producto " + (i + 1) + " es: " + (suma / precios[i].length));
        }
    }
}
