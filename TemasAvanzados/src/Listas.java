import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        List<String> miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sábado");
        miLista.add("Domingo");
        miLista.add("Apocalípsis");
        // Una lista permite elementos duplicados
        for(String elemento: miLista){
            System.out.println("Día de la semana: " +  elemento);
        }

        // Funciones lambda (función anónima de un código muy compacto)
        miLista.forEach( elemento -> {
            System.out.println("Elemento: " + elemento);
        } );

        miLista.forEach(System.out::println);


        List<String> nombres = Arrays.asList("Pedro", "Pablo", "Picasso");
        nombres.forEach(System.out::println);

    }
}
