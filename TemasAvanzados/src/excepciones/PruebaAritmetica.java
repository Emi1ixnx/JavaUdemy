package excepciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        try {
            var resultado = Aritmetica.division(10, 0);
            System.out.println("resultado = " + resultado);
        }catch(Exception e) {
            System.out.println("Error: " + e);
        }
        finally{
            System.out.println("Se revisó la división entre 0");
        } // este bloque siempre se ejecutaría, sin importar si encontró un error o no
    }
}
