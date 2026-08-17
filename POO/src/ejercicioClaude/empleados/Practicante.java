package ejercicioClaude.empleados;

public class Practicante extends Empleado{
    private double becaMensual;

    public Practicante(String nombre,double becaMensual) {
        super(nombre);
        this.becaMensual = becaMensual;
    }

    @Override
    public double calcularSueldo(){
        return becaMensual;
    }
}
