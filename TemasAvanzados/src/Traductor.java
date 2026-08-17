public interface Traductor {
    // public y abstract
    void traducir();

    // Métodos con implementación por default
    // No están obligadas a usar este comportamiento
    default void iniciarTraductor(){
        System.out.println("Iniciando traductor...");
    }
}

class Ingles implements Traductor{
    @Override // realmente apenas lo estamos definiendo, pero weno
    public void traducir(){
        System.out.println("Traduzco a inglés");
    }
}

class Frances implements Traductor{
    public void traducir(){
        System.out.println("Traduzco a francés");
    }

    @Override
    public void iniciarTraductor(){
        System.out.println("Iniciando traductor en francés");
    }
}

class PruebaTraductor {
    public static void main(String[] args) {
        Traductor ingles = new Ingles();
        ingles.iniciarTraductor();
        ingles.traducir();
        ingles = new Frances();
        ingles.traducir();
        ingles.iniciarTraductor();
    }
}