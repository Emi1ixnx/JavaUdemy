public class BusquedaSubcadenas {
    public static void main(String[] args) {
        System.out.println("*** Buscar subcadenas ***");
        // IndexOf - Devuelve el indice de la primera aparicion de la subcadena
        var cadena1 = "Hola mundo";
        // subcadena a buscar "Hola"
        var indice1 = cadena1.indexOf("Hola");
        System.out.println("indice1 = " + indice1);
        var indice2 = cadena1.indexOf("mundo");
        System.out.println("indice2 = " + indice2);
        // lastIndexOf - devuelve el indice de la ultima aparicion de la subcadena
        // subcadena de "mundo"
        var indice3 = cadena1.lastIndexOf("Hola");
        System.out.println("indice3 = " + indice3);
        var indice4 = cadena1.lastIndexOf("mundo");
        System.out.println("indice4 = " + indice4);
        // subcadena no encontrada devuelve -1
        var indice5 = cadena1.indexOf("Java");
        System.out.println("indice5 = " + indice5);

    }
}
