public class PalabraBreakContinue {
    public static void main(String[] args) {
        System.out.println("*** Break y continue ***");

        // Ejemplo break, imprimir solo el primer numero par
        System.out.println("Palabra break");
        for (var numero = 1; numero < 10; numero++){
            if (numero % 2 == 0){
                System.out.print(numero + " ");
                break;
            }
        }

        // Ejemplo con continue. Imprimir solo numeros pares, ignorar los numeros impares
        System.out.println("\nPalabra continue: ");
        for (var numero = 1; numero < 10; numero++){
            if(numero % 2 == 1) { // numero impar
                continue; // saltamos a la siguiente iteración
            }
            System.out.print(numero + " "); // numeros pares
        }
    }
}
