package persona;

public class Persona{
    private static int contadorPersonas = 0;
    private int idPersona;
    private String nombre;
    private String apellido;

    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        // Incrementar el contador estático
        Persona.contadorPersonas++;
        // Asignamos el id unico con ayuda de la variable estatica
        this.idPersona = Persona.contadorPersonas;
    }

    @Override
    public String toString(){
        return "Id: " + this.idPersona
                + ", Nombre: "
                + this.nombre + ", Apellido: "
                + this.apellido;
    }

    void mostrarPersona(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
    }

    // Agregar método get
    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }

    public int getIdPersona(){
        return this.idPersona;
    }

    // Agregar método set
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public static int getContadorPersonas(){
        return Persona.contadorPersonas;
    }

}