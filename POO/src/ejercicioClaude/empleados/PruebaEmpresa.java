package ejercicioClaude.empleados;

public class PruebaEmpresa {
    public static void main(String[] args) {
        Empresa empresa1 = new Empresa();

        Gerente gerente1 = new Gerente("Juan", 15000, 3000);
        Vendedor vendedor1 = new Vendedor("Miguel", 8000, 200, 15);
        Practicante practicante1 = new Practicante("Ana", 3000);

        empresa1.contratar(gerente1);
        empresa1.contratar(vendedor1);
        empresa1.contratar(practicante1);
        System.out.println(empresa1);
    }
}
