package ejercicioClaude.empleados;

public class Empresa {
    private Empleado [] empleados;
    private static final int MAX_EMPLEADOS = 5;
    private int contadorEmpleados;

    public Empresa() {
        this.empleados = new Empleado[MAX_EMPLEADOS];
    }

    public void contratar(Empleado empleado){
        if (this.contadorEmpleados < MAX_EMPLEADOS) {
            this.empleados[this.contadorEmpleados++] = empleado;
        }
        else {
            System.out.println("No se puede contratar el empleado");
        }
    }

        public double calcularNominaTotal(){
        double nomina = 0;
            for  (int i = 0; i < this.contadorEmpleados; i++) {
            nomina += this.empleados[i].calcularSueldo();
        }
            return nomina;
    }

    @Override
    public String toString() {
        String respuesta ="";
        respuesta += "Número de empleados: " + this.contadorEmpleados + "\n";
        respuesta += "Nomina a cubrir: " +  this.calcularNominaTotal() + "\n";
        respuesta += "Empleados: \n";
        for (int i = 0; i <this.contadorEmpleados; i++) {
            respuesta += "\t"+ this.empleados[i].toString() + "\n";
        }
        return respuesta;
    }
}
