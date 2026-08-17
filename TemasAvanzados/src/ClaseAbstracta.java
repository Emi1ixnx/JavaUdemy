public class ClaseAbstracta {
    public static void main(String[] args) {
        //FiguraGeometrica figuraGeometrica = new FiguraGeometrica() {} // error, no se puede instanciar
        FiguraGeometrica figuraGeometrica = new Rectangulo();
        figuraGeometrica.dibujar();
        figuraGeometrica = new Circulo();
        figuraGeometrica.dibujar();
    }
}

// Clase abstracta
abstract class FiguraGeometrica{ // no se pueden instanciar, o sea, no se pueden crear objetos
    public abstract void dibujar();
}

class Rectangulo extends FiguraGeometrica{
    @Override
    public void dibujar(){
        System.out.println("Se dibuja un rectangulo");
    }
}

class Circulo extends FiguraGeometrica{
    @Override
    public void dibujar(){
        System.out.println("Se dibuja un circulo");
    }
}