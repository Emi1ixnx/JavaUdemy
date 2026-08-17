package ejercicioClaude.empleados;

public class Empleado {
    private final int idEmpleado;
    private static int contadorEmpleado;
    private String nombre;
    private double sueldoBase;

    public Empleado(String nombre, double sueldoBase) {
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
        this.idEmpleado = ++Empleado.contadorEmpleado;
    }

    public Empleado(String nombre){
        this(nombre,0);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public double calcularSueldo(){
        return sueldoBase;
    }

    @Override
    public String toString(){
        String resultado;
        resultado = "ID: " + idEmpleado;
        resultado += "\nNombre: " + nombre;
        resultado += "\nSueldo: " + calcularSueldo();
        return resultado;
    }
}
