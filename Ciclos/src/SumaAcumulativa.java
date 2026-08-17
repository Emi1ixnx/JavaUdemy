public class SumaAcumulativa {
    public static void main(String[] args) {
        System.out.println("*** Suma acumulativa ***");

        final var MAXIMO = 5;
        var acumuladorSuma = 0;

        // Iterar los valores
        var numero = 1;
        while(numero <= MAXIMO){
            // Imprimir lo que se va a sumar
            System.out.println("(acumuladorSuma + número) -> "
                    + acumuladorSuma + " + " + numero);

            // Realizar la suma acumulativa
            acumuladorSuma += numero++; // acumuladorSuma = acumuladorSuma + numero

            // Imprimir
            System.out.println("Suma parcial acumulada: " + acumuladorSuma + "\n");
        }
        System.out.println("Suma de los primeros "
                + MAXIMO + " números: " + acumuladorSuma);

    }
}
