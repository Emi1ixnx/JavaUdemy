import java.util.Scanner;

public class RangoVariable {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        System.out.println("Proporciona un dato entero: ");
        var dato = Integer.parseInt(consola.nextLine());

        // Revisamos si está dentro de rango  (entre 1 y 10)
        var estaDentroRango = dato >= 1 && dato <= 10;
        System.out.println("Variable dentro de rango (1 y 10) ?" +  estaDentroRango);

        // Revisamos la lógica inversa, si el dato está fuera de rango
        var fueraDeRango = !(dato >= 1 && dato <= 10);
        System.out.println("Variable fuera de rango (1 y 10) ?= " + fueraDeRango);
    }
}
