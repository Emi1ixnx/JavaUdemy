import java.util.Scanner;

public class NumeroPositivo {
    public static void main(String[] args) {

        // Iniciar escaner
        Scanner consola = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        var numero = consola.nextInt();

        if (numero > 0){
            System.out.println("Numero positivo");
        }
        else if (numero < 0) {
            System.out.println("Numero negativo");
        }
        else {
            System.out.println("Es cero");
        }
    }
}
