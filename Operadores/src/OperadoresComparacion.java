public class OperadoresComparacion {
    public static void main(String[] args) {
        System.out.println("*** Operadores de comparación ***");
        int a = 3, b = 2;
        // Igualdad ==
        var resultado = (a == b); // Puede ser sin paréntesis
        // La comparación se hace primero, después de agrega a "resultado", es una especie de jerarquía de operadores
        System.out.println("resultado a == b: " + resultado);

        // Distinto
        resultado = a != b;
        System.out.println("resultado a != b: " + resultado);

        // Mayor que
        resultado = a > b;
        System.out.println("resultado a > b: " + resultado);

        // Mayor o igual que
        resultado = a >= b;
        System.out.println("resultado a >= b: " + resultado); // dice true pq es mayor, no porque sea igual, ojo

        // Menor que
        resultado = a < b;
        System.out.println("resultado a < b:  " + resultado);

        // Menor o igual que
        resultado = a <= b;
        System.out.println("resultado a <= b: " + resultado);
    }
}
