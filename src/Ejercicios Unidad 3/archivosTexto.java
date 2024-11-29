import java.io.*;
import java.util.Scanner;

public class archivosTexto {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String fileName = "notas.txt";

        while (true) {
            System.out.println("1. Añadir nota");
            System.out.println("2. Mostrar notas");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir salto de línea

            if (opcion == 1) {
                System.out.print("Escribe tu nota: ");
                String nota = scanner.nextLine();
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
                    writer.write(nota);
                    writer.newLine();
                }
                System.out.println("Nota guardada.");
            } else if (opcion == 2) {
                try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                    String linea;
                    System.out.println("Notas guardadas:");
                    while ((linea = reader.readLine()) != null) {
                        System.out.println(linea);
                    }
                }
            } else if (opcion == 3) {
                System.out.println("Adiós.");
                break;
            } else {
                System.out.println("Opción no válida.");
            }
        }
        scanner.close();
    }
}

