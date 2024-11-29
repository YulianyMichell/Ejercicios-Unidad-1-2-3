import java.sql.*;
import java.util.Scanner;

public class GestionUsuarios {
    private static final String URL = "jdbc:mysql://localhost:3306/mi_base_de_datos";
    private static final String USER = "root";
    private static final String PASSWORD = "password";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            while (true) {
                System.out.println("1. Añadir usuario");
                System.out.println("2. Eliminar usuario");
                System.out.println("3. Actualizar usuario");
                System.out.println("4. Salir");
                System.out.print("Elige una opción: ");
                int opcion = scanner.nextInt();
                scanner.nextLine(); // Consumir salto de línea

                if (opcion == 1) {
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    String sql = "INSERT INTO usuarios (nombre, email) VALUES (?, ?)";
                    try (PreparedStatement stmt = connection.prepareStatement(sql)) {
                        stmt.setString(1, nombre);
                        stmt.setString(2, email);
                        stmt.executeUpdate();
                        System.out.println("Usuario añadido.");
                    }
                } else if (opcion == 2) {
                    System.out.print("ID del usuario a eliminar: ");
                    int id = scanner.nextInt();
                    String sql = "DELETE FROM usuarios WHERE id = ?";
                    try (PreparedStatement stmt = connection.prepareStatement(sql)) {
                        stmt.setInt(1, id);
                        stmt.executeUpdate();
                        System.out.println("Usuario eliminado.");
                    }
                } else if (opcion == 3) {
                    System.out.print("ID del usuario a actualizar: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consumir salto de línea
                    System.out.print("Nuevo nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Nuevo email: ");
                    String email = scanner.nextLine();
                    String sql = "UPDATE usuarios SET nombre = ?, email = ? WHERE id = ?";
                    try (PreparedStatement stmt = connection.prepareStatement(sql)) {
                        stmt.setString(1, nombre);
                        stmt.setString(2, email);
                        stmt.setInt(3, id);
                        stmt.executeUpdate();
                        System.out.println("Usuario actualizado.");
                    }
                } else if (opcion == 4) {
                    System.out.println("Adiós.");
                    break;
                } else {
                    System.out.println("Opción no válida.");
                }
            }
        } catch (SQLException e) {
            System.err.println("Error de conexión: " + e.getMessage());
        }
        scanner.close();
    }
}

