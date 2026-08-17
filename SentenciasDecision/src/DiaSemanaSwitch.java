import java.util.Scanner;

public class DiaSemanaSwitch {
    public static void main(String[] args) {
        System.out.println("*** Dia Semana Switch ***");
        var dia = 9;

        switch (dia) {
            case 1:
        System.out.println("Lunes");
            break;
            case 2:
        System.out.println("Martes");
            break;
            case 3:
        System.out.println("Miercoles");
            break;
            case 4:
        System.out.println("Jueves");
            break;
            case 5:
        System.out.println("Viernes");
            break;
            case 6:
        System.out.println("Sabado");
            break;
            case 7:
        System.out.println("Domingo");
            break;
            default:
         System.out.println("No se puede establecer la dia de semana");
        }
        // Switch mejorado
        System.out.println("**** Switch mejorado ****");
        var diaSemanillata = "";
        diaSemanillata = switch (dia) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miércoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sábado";
            case 7 -> "Domingo";
            default -> "Watafak amigo";
        };
        System.out.println(diaSemanillata);
    }
}
