package ejercicioClaude;

public class Biblioteca {
    private final int idSucursal;
    private static int contadorSucursales;
    private int contadorLibros;
    private static final int MAX_LIBROS = 5;
    private Libro[] libros;

    public Biblioteca() {
        this.idSucursal = ++contadorSucursales;
        this.libros = new Libro[MAX_LIBROS];
        
    }

    public void agregarLibro(Libro libro) {
        if (this.contadorLibros < MAX_LIBROS) {
            this.libros[this.contadorLibros++] = libro;
        }
        else {
            System.out.println("Se ha superado el máximo de libros: " + MAX_LIBROS);
        }
    }

    public int calcularValorTotal (){
        var suma = 0;
        for (int i = 0; i < this.contadorLibros; i++) {
           suma += this.libros[i].getPrecio();
        }
        return suma;
    }

    @Override
    public String toString(){
        var resultado = "ID de sucursal: " + this.idSucursal + "\n";
            resultado += "Libros disponibles: " + contadorLibros + "\n";
            resultado += "Valor total de libros: $" + calcularValorTotal() + "\n";
            resultado += "Libros:\n";
            for (int i = 0; i < this.contadorLibros; i++) {
                resultado += "\t" + (this.libros[i]) + "\n";
        }
        return resultado;
    }
}
