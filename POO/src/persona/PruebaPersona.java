package persona;

public class PruebaPersona {
    public static void main(String[] args) {
        System.out.println("*** Creacion de Clase y Objetos persona.Persona ***");
        System.out.println("Variable estática: " + Persona.getContadorPersonas());
        var objeto1 = new Persona("Emiliano", "Aguilar");
        objeto1.mostrarPersona();
        // Cambiar y obtener atributos con get y set
        objeto1.setApellido("Dolores");
        objeto1.mostrarPersona();
        System.out.println(objeto1); // automáticamente se llama al toString
        System.out.println("Variable estática: " + Persona.getContadorPersonas());
        // Segundo objeto
        var objeto2 = new Persona ("Carlos", "Perez");
        System.out.println(objeto2);
        System.out.println("Variable estática: " + Persona.getContadorPersonas());


    }
}
