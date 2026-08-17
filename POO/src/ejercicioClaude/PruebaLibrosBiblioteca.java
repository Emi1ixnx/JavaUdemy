package ejercicioClaude;

public class PruebaLibrosBiblioteca {
    public static void main(String[] args) {
        System.out.println("*** Sistema de biblioteca ***");
        Libro libro1 = new Libro("La tregua", "Mario Benedetti", 200);
        Libro libro2 = new Libro("El fantasma de Canterville", "Oscar Wilde", 300);

        Biblioteca biblioteca1 = new Biblioteca();

        biblioteca1.agregarLibro(libro1);
        biblioteca1.agregarLibro(libro2);
        System.out.println(biblioteca1);
    }
}
