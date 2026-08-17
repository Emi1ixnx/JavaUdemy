package ejercicioClaude.empleados;

public class Vendedor extends Empleado {
    private double comisionPorVenta;
    private int numeroVentas;

    public Vendedor(String nombre,double sueldoBase, double comisionPorVenta, int numeroVentas) {
        super(nombre,sueldoBase);
        this.comisionPorVenta = comisionPorVenta;
        this.numeroVentas = numeroVentas;
    }

    @Override
    public double calcularSueldo() {
        return super.calcularSueldo() + (comisionPorVenta * numeroVentas);
    }
}
