public class CicloWhile {
    public static void main(String[] args) {
        System.out.println("*** Ciclo While ***");

        var contadorCero = 1;
        var contadorUno = 0;

        // Forma tradicional
        while (contadorCero <= 5) {
            System.out.println(contadorCero);
            contadorCero++;
        }

        // Forma simplificada cuando sólo hay una línea de código
        while (contadorUno <= 5)
            System.out.println(contadorUno++);
    }
}
