package ejercicioClaude.herenciaypolimorfismo;

public class Animal {

    private String nombre;
    private int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad(){
        return this.edad;
    }

    public String hacerSonido(){
        return "Hace un sonido";
    }
}
class Perro extends Animal{
    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public String hacerSonido(){
        String sonidoOriginal = super.hacerSonido();
        return sonidoOriginal + " en realidad: Guau guau";
    }
}
class Gato extends Animal{
    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public String hacerSonido(){
        String sonidoOriginal = super.hacerSonido();
        return sonidoOriginal + " en realidad: Miau miau";
    }
}

