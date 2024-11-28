public class promedioCalificaciones {

    public static void main(String[] args) {
        // Declaración e inicialización de la matriz de calificaciones
        int[][] calificaciones = {
            {85, 90, 78},  // Calificaciones del estudiante 1
            {92, 88, 95},  // Calificaciones del estudiante 2
            {76, 81, 85}   // Calificaciones del estudiante 3
        };

        // Cálculo y despliegue de los promedios de los estudiantes
        for (int i = 0; i < calificaciones.length; i++) {
            int suma = 0;
            for (int j = 0; j < calificaciones[i].length; j++) {
                suma += calificaciones[i][j];
            }
            double promedio = (double) suma / calificaciones[i].length;
            System.out.println("Promedio del estudiante " + (i + 1) + ": " + promedio);
        }
    }
}
