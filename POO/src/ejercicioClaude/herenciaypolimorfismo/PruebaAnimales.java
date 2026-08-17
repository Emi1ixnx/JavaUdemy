package ejercicioClaude.herenciaypolimorfismo;

public class PruebaAnimales {
    public static void main(String[] args) {
        Animal[] animales = new Animal[3];

        animales[0] = new Perro("Firulais", 3);
        animales[1] = new Gato("Michi", 2);
        animales[2] = new Gato("Micho", 1);

        for (int i = 0; i < animales.length; i++) {
            System.out.println(animales[i].getNombre() + " dice: " + animales[i].hacerSonido());
        }
    }
}