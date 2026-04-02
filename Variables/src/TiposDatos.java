public class TiposDatos {
    public static void main(String[] args) {
        // Tipos de datos en Java
        // Entero (Su valor por default es 0)
        byte tipoByte = 127; //127 es el valor máximo
        System.out.println("tipoByte = " + tipoByte);
        short tipoShort = 32000;
        System.out.println("tipoShort = " + tipoShort);
        int tipoInt = 2147483647;
        System.out.println("tipoInt = " + tipoInt);
        long tipoLong = 987654321098765432L; // L o l para indicar tipo long
        System.out.println("tipoLong = " + tipoLong);

        // Punto flotante (Su valor default es 0.0)
        float tipoFloat = 3.14F;  // F o f para indicar tipo float
        System.out.println("tipoFloat = " + tipoFloat);
        double tipoDouble = 3.1315;
        System.out.println("tipoDouble = " + tipoDouble); // D o d para indicar tipo double (opcional)

        // Caracter (Valor por default '\u0000' o sea: 0)
        char tipoChar = 'A'; // Caracteres del juego unicode
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = 65; // Es el valor de la letra A en el juego de caracteres de unicode
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = '@';
        System.out.println("tipoChar = " + tipoChar);

        // Booleano (Valor por default false)
        boolean tipoBoolean = true;
        System.out.println("tipoBoolean = " + tipoBoolean);
        tipoBoolean = false;
        System.out.println("tipoBoolean = " + tipoBoolean);

        // Tipos Object (su valor por default es null)
        String nombre = null;
        System.out.println("nombre = " + nombre);
        nombre = "Juan";
        System.out.println("nombre = " + nombre);
    }
}
