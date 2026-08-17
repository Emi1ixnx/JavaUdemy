public class OperadoresAsignacion {
    public static void main(String[] args) {
        System.out.println("*** Operadores de asignación ***");
        // Asignación =
        var miNumero = 10;
        int miNumero2; // Cuando especifico el tipo de dato, puedo iniciarlo en otra linea si quiero, en var no
        miNumero2 = 15;

        // Asignación compuesta
        // +=
        miNumero += 5; // miNumero = miNumero +5; -> 15
        System.out.println("miNumero = " + miNumero);
        // -=; *=, /= y %=
        miNumero *= 2; // m0i0Numero = miNumero * 2 -> 30
        System.out.println("miNumero = " + miNumero);

        // Asignación de variables multiples
        int a = 10, b = 15, c = 20; // Con var no puedo definir varias variables, sólo indicando el tipo de dato
        System.out.printf("a = %d, b = %d, c = %d", a, b, c);
    }
}
