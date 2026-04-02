public class IndicesCadena {
    public static void main(String[] args) {
        System.out.println("*** Manejo de indices en una cadena ***");
        var cadena1 = "Hola mundo";

        // Recuperar el primer caracter
        var primerCaracter = cadena1.charAt(0);
        System.out.println("primerCaracter = " + primerCaracter);
        // Recuperar el último caracter (en la posición 9)
        var ultimoCaracter = cadena1.charAt(9);
        System.out.println("ultimoCaracter = " + ultimoCaracter);
        // Recuperar la letra M
        var letraM = cadena1.charAt(5);
        System.out.println("letraM = " + letraM);

    }
}
