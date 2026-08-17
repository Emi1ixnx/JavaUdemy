public class OperadorTernario {
    public static void main(String[] args) {
        System.out.println("*** Operador ternario ***");
        // Sintaxis
        // condicion ? exp1 : exp2  se llama ternario pq tiene dos partes

        // Determinar si un número es par o no
        var numero = 5;
        var resultado = (numero % 2 == 0) ? "Par" : "Impar";
        System.out.println("El numero " + numero + " es: " + resultado);

        // Calcular si es mayor de edad
        var edad = 44;
        var mensaje = (edad >= 18) ? "Eres mayor de edad" : "No eres mayor de edad";
        System.out.println("\nTienes " + edad + ", " + mensaje);

        // Valor positivo, negativo o cero (operador ternario anidado)
        numero = 9;
        resultado = (numero > 0) ? "Positivo" : (numero < 0) ? "Negativo" : "Cero";
        System.out.println("\nEl numero " + numero + " es " +  resultado);

    }
}
