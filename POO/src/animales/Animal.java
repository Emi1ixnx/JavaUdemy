package animales;

public class Animal {
    protected void hacerSonido(){
        System.out.println("El animal hace un sonido");
    }
    protected void comer(){
        System.out.println("Comiendo");
    }
    protected void dormir(){
        System.out.println("Durmiendo");
    }
}
class Perro extends Animal {
    @Override
    public void hacerSonido(){
        System.out.println("Ladrando, pq soy un perrillo");
    }
    @Override
    protected void dormir(){
        System.out.println("Soy un perro dormido, guaf");
        System.out.println("Método de la clase padre: ");
        super.dormir();
    }
}

class Gato extends Animal {
    @Override
    protected void hacerSonido(){
        System.out.println("Soy un gato y hago miau, jej");
    }
}

class PruebaAnimal {

    //Método polimorfico
    static void imprimirSonido(Animal animal){
        animal.hacerSonido();
    }

    public static void main(String[] args) {
        /*System.out.println("Ejemplo de herencia");
        System.out.println("Clase padre, soy un animal");
        var animal1 = new Animal();
        animal1.comer();
        animal1.dormir();
        System.out.println("\nClase hija, soy un perro");
        var perro1 = new Perro();
        perro1.hacerSonido();
        perro1.dormir();
        perro1.comer();*/

        // Objeto de la clase padre (Animal)
        //var animal = new Animal();
        //var animal = new Perro();
        var cabronsete = new Gato();
        imprimirSonido(cabronsete);
    }
}