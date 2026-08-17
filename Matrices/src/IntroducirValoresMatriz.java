import java.util.Scanner;

public class IntroducirValoresMatriz {
    public static void main(String[] args) {
    // Introducir valores a una matriz
        int renglones, columnas;
        var consola = new Scanner(System.in);
        // Definir la matriz
        System.out.print("Proporciona los renglones de la matriz:\s");
        renglones = Integer.parseInt(consola.nextLine());
        System.out.print("Proporciona las columnas:\s");
        columnas = Integer.parseInt(consola.nextLine());
        var matriz = new int[renglones][columnas];
        // Solicitar los valores
        for (var ren = 0; ren < renglones; ren++) {
            for (var col = 0; col < columnas; col++) {
                System.out.print("Valor[" + ren + "][" + col + "] =\s");
                matriz[ren][col] = Integer.parseInt(consola.nextLine());
            }
        }
        System.out.println();
        // Iterar los valores de la matriz
        for (var ren = 0; ren < renglones; ren++) {
            for (var col = 0; col < columnas; col++) {
                System.out.println("Matriz[" + ren + "][" +  col + "] =\s" +
                        matriz[ren][col]);
            }
        }

    }
}