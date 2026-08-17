public class RetoNumerosImpares {
    public static void main(String[] args) {
        System.out.println("Reto números impares del 0 al 20 usando do-While");

        var contador = 0;

        do {
            if (contador % 2 != 0)
                System.out.print(contador + " ");
                contador++;
        } while (contador <= 20);
    }
}
