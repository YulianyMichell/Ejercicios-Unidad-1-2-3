import java.io.*;
import java.util.Scanner;

public class gestionLibros {
    private static final String FILE_NAME = "libros.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Gestión de Libros ---");
            System.out.println("1. Añadir libro");
            System.out.println("2. Buscar libro");
            System.out.println("3. Listar todos los libros");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir salto de línea

            switch (opcion) {
                case 1:
                    añadirLibro(scanner);
                    break;
                case 2:
                    buscarLibro(scanner);
                    break;
                case 3:
                    listarLibros();
                    break;
                case 4:
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    private static void añadirLibro(Scanner scanner) {
        System.out.print("Título del libro: ");
        String titulo = scanner.nextLine();
        System.out.print("Autor del libro: ");
        String autor = scanner.nextLine();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            writer.write(titulo + ";" + autor);
            writer.newLine();
            System.out.println("Libro añadido correctamente.");
        } catch (IOException e) {
            System.err.println("Error al guardar el libro: " + e.getMessage());
        }
    }

    private static void buscarLibro(Scanner scanner) {
        System.out.print("Título del libro a buscar: ");
        String tituloBuscado = scanner.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String linea;
            boolean encontrado = false;

            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(";");
                if (datos[0].equalsIgnoreCase(tituloBuscado)) {
                    System.out.println("Libro encontrado: ");
                    System.out.println("Título: " + datos[0]);
                    System.out.println("Autor: " + datos[1]);
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                System.out.println("No se encontró un libro con ese título.");
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    private static void listarLibros() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String linea;
            System.out.println("\n--- Lista de Libros ---");
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(";");
                System.out.println("Título: " + datos[0] + ", Autor: " + datos[1]);
            }
        } catch (FileNotFoundException e) {
            System.out.println("No hay libros registrados.");
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}

