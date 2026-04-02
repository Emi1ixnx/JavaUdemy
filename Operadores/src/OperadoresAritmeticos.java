public class OperadoresAritmeticos {
    public static void main(String[] args) {
        System.out.println("*** Operadores aritméticos ***");
        int a = 5, b = 3, resultado = 0; // Usar var no se puede en este tipo de declaraciones (compuesta)

        // Suma +
        resultado = a + b;
        System.out.println("resultado = " + resultado);

        // Resta -
        resultado = a - b;
        System.out.println("resultado = " + resultado);

        // Multiplicación *
        resultado = a * b;
        System.out.println("resultado = " + resultado);

        // División /
        resultado = a / b;
        System.out.println("resultado = " + resultado);

        // Módulo (residuo de la división) %
        resultado = a % b;
        System.out.println("resultado = " + resultado);

    }
}
