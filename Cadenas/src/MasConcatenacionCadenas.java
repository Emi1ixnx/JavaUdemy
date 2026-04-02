public class MasConcatenacionCadenas {
    public static void main(String[] args) {
        System.out.println("*** Más formas de concatenación en Java ***");

        var cadena1 = "Hola";
        var cadena2 = "mundo";
        var cadena3 = cadena1 +" "+ cadena2;
        System.out.println("cadena3 usando + = " + cadena3); // Metodo +

        // Metodo concat
        cadena3 = cadena1.concat(" ").concat("Mundo");
        System.out.println("cadena3 usando concat = " + cadena3);

        // Clase StringBuilder, no genera más instancias como en los métodos anteriores
        var constructorCadenas = new StringBuilder(); // será de la clase StringBuilder
        constructorCadenas.append(cadena1);
        constructorCadenas.append(" ");
        constructorCadenas.append(cadena2);
        var resultado = constructorCadenas.toString(); // con esto se genera la cadena final
        System.out.println("resultado = " + resultado);

        // StringBuffer - para varios hilos
        var stringBuffer = new StringBuffer();
        stringBuffer.append(cadena1).append(" ").append(cadena2);
        resultado = stringBuffer.toString();
        System.out.println("resultado StringBuffer = " + resultado);

        // Join
        resultado = String.join(" ", cadena1, cadena2, "adios");
        System.out.println("resultado = " + resultado);

    }
}
