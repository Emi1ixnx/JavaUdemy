public class CaracteresEspeciales {
    public static void main(String[] args) {
        System.out.println("*** Caracteres especiales ***");

        // \n - imprimir un salto de linea
        var cadena1 = "Hola \nmundo";
        System.out.println("cadena1 = " + cadena1);

        // \t - tabulador
        var cadena2 = "\tHola\tmundo";
        System.out.println("cadena2 = " + cadena2);

        // \' - agregar una comilla simple
        var cadena3 = "Hola \' mundo";
        System.out.println("cadena3 = " + cadena3);

        // \" - agrega una comilla doble
        var cadena4 = "Hola \" mundo";
        System.out.println("cadena4 = " + cadena4);

        // \\ - caracter de diagonal invertida
        var cadena5 = "Hola \\ mundo";
        System.out.println("cadena5 = " + cadena5);


    }
}
