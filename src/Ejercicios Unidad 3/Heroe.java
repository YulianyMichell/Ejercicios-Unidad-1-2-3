public class Heroe {
    private String nombre;
    private int poder;

    // Constructor
    public Heroe(String nombre, int poder) {
        this.nombre = nombre;
        this.poder = poder;
    }

    // Método para obtener el nombre del héroe
    public String getNombre() {
        return nombre;
    }

    // Método para verificar si el héroe puede salvar el mundo
    public boolean salvarMundo() {
        return poder >= 80;
    }
}


