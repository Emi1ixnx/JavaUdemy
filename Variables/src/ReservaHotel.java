public class ReservaHotel {
    public static void main(String[] args) {
        System.out.println("*** Sistema de reserva de hoteles ***");
        String nombreCliente = "Tami";
        String apellidoCliente = "Aguilar";
        var nombreCompleto = nombreCliente + " " + apellidoCliente;
        var diasEstancia = 4;
        var tarifaDiaria = 1000;
        boolean vistaMar = true;

        // Imprimir

        System.out.println("nombreCompleto = " + nombreCompleto);
        System.out.println("diasEstancia = " + diasEstancia);
        System.out.println("tarifaDiaria = " + tarifaDiaria);
        System.out.println("vistaMar = " + vistaMar);

        // Modificación

        nombreCompleto = "Kiriko Rodriguez";
        diasEstancia = 5;
        tarifaDiaria = 1200;
        vistaMar = false;

        // Imprimir
        System.out.println("nombreCompleto = " + nombreCompleto);
        System.out.println("diasEstancia = " + diasEstancia);
        System.out.println("tarifaDiaria = " + tarifaDiaria);
        System.out.println("vistaMar = " + vistaMar);

    }
}
