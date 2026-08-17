import java.util.Scanner;

public class CasaDeLosEspejos {
    public static void main(String[] args) {
        System.out.println("*** Bienvenidos a la casa de los espejos ***");

        var consola = new Scanner(System.in);

        System.out.print("¿Cuál es tu edad?: ");
        var edad = Integer.parseInt(consola.nextLine());

        System.out.print("¿Tienes miedo a la oscuridad? (true/false): ");
        var tienesMiedo = Boolean.parseBoolean(consola.nextLine());

        // Verificación lógica inversa
        if (!tienesMiedo && edad >= 10) {
            System.out.println("Puedes entrar a la casa de los espejos");
        }
        else if (tienesMiedo && edad >= 10)  {
            System.out.println("Puedes entrar pero te vas a cagar");
        }
        else if(!tienesMiedo && edad < 10) {
            System.out.println("Duro, mi G");
        }
        else {
            System.out.println("No puedes entrar a la casa de los espejos");
        }
    }
}
