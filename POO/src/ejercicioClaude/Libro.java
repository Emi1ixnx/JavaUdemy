package ejercicioClaude;

public class Libro {
    private final int idLibro;
    private String titulo;
    private String autor;
    private int precio;
    private static int contadorLibros;

    // Constructor

    public Libro(String titulo, String autor, int precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.idLibro = ++contadorLibros;
    }

    // Métodos get y set
    public int getIdLibro() {
        return idLibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    // Método toString

    @Override
    public String toString() {
        return "Titulo: " + this.getTitulo() +
        "Autor: " + this.getAutor() +
        " Precio: " + this.getPrecio();
    }
}
