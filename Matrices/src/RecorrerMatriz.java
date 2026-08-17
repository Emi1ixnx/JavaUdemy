public class RecorrerMatriz {
    public static void main(String[] args) {

        final var RENGLONES = 2;
        final var COLUMNAS = 3;

        var matriz2 = new int [RENGLONES][COLUMNAS];

        matriz2[0][0] = 100;
        matriz2[0][1] = 200;
        matriz2[0][2] = 300;
        matriz2[1][0] = 400;
        matriz2[1][1] = 500;
        matriz2[1][2] = 600;

        // Recorrer una matriz
        // 1. Ciclo más externo. Recorrer los renglones
        for (var ren = 0; ren < RENGLONES; ren++) {
            // 2. Ciclo interno. Recorrer las columnas
            for (var col = 0; col < COLUMNAS; col++) {
                System.out.println("Valor[" + ren + "][" + col + "] = " + matriz2[ren][col]);
            }
        }
    }
}
