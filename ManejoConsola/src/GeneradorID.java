import java.util.Random;
import java.util.Scanner;

public class GeneradorID {
    public static void main(String[] args) {
        System.out.println("*** Generador de ID ***");

        // El programa deberá generar un valor aleatorio de 4
        // digitos, entre 1 y 9999. Si el número generado es menor a 4 dígitos
        // se debe completar el valor con ceros y a la izquierda

        // Con los datos obtenidos debe generar un valor de ID único
        // uniendo los valorss de la siguiente forma:
        // Nombre: Juan JU  Apellido: Perez PE Año: 1995 95
        // Aleatorio: 0736 ID único: JUPE950736

        // Encender Scanner
        Scanner consola = new Scanner(System.in);

        // Pedir los datos
        System.out.print("Ingresa tu nombre: ");
        var nombre = consola.nextLine();
        System.out.print("Ingresa tu apellido: ");
        var apellido = consola.nextLine();
        System.out.print("Ingresa tu año de nacimiento: ");
        var anio = consola.nextInt();
        var anioString = String.valueOf(anio); //Aquí convertí de int a String para poder usar subString

        // Generar número random
        var random = new Random();
        var numeroRandom = random.nextInt(9998)+1;

        // Subcadenas de los datos
        var subcadenaNombre = nombre.substring(0,2);
        var subcadenaApellido = apellido.substring(0,2);
        var subcadenaAnio =  anioString.substring(2,4);

        // ToUpper
        subcadenaNombre = subcadenaNombre.toUpperCase();
        subcadenaApellido = subcadenaApellido.toUpperCase();

        // Juntar datos
        System.out.printf("ID: %s%s%s%d", subcadenaNombre, subcadenaApellido, subcadenaAnio, numeroRandom);

    }
}
