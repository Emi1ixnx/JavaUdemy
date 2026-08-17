public class CicloDoWhile {
    public static void main(String[] args) {
        System.out.println("*** Ciclo do-While ***");

        var contador = 1;

        do {
            System.out.print(contador + " ");
            contador++;
        } while (contador <= 3);
    }
}
