import java.util.Scanner;

public class RetoSumaDiagonal {
    public static void main(String[] args) {
        System.out.println("*** Suma diagonal de matriz ***");
        // iniciar variables de matriz
        int renglones = 3, columnas = 3;
        var matriz = new int [renglones][columnas];
        // Más variables
        int sumatoria = 0;
        // Inicializar consola
        var consola = new Scanner(System.in);

        // Hacer la matriz
        for (var ren = 0; ren < renglones; ren++) {
            for (var col = 0; col < columnas; col++) {
                System.out.print("introduce el valor[" + ren + "][" + col + "] =\s");
                matriz[ren][col] = Integer.parseInt(consola.nextLine());
                if (ren == col) {
                    sumatoria = sumatoria + matriz[ren][col];
                }
            }
        }
            // Iterar la matriz y mostrar la suma de los valores en diagonal

            for(var ren = 0; ren < renglones; ren++ ){
                for (var col = 0; col < columnas; col++){
                    System.out.println("Valor[" + ren + "][" + col + "] = " + matriz[ren][col]);
                }
            }
        System.out.println("El valor de la suma de los dígitos en diagonal " +
                "es:\s" + sumatoria);
        }
}