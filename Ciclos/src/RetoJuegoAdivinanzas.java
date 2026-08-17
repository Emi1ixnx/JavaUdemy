import java.util.Random;
import java.util.Scanner;

public class RetoJuegoAdivinanzas {
    public static void main(String[] args) {
        System.out.println("*** Bienvenido al juego de adivinanzas ***");
        var consola = new Scanner(System.in);
        var numeroRandom = new Random();

        var numero = 0;
        var aumento = 0;
        int random = numeroRandom.nextInt(10) + 1;
        int randomDificil = numeroRandom.nextInt(20) + 1;

        System.out.print("""
                1. Casual
                2. Normal
                3. Difícil
                """);
        var opcion = consola.nextInt();
        switch (opcion) {
            case 1 -> {
                while (numero != random) {
                    aumento++;
                    System.out.print("Escribe el número:\s");
                    numero = consola.nextInt();
                    if (numero > random) {
                        System.out.println("Menos, jej");
                    } else if (numero < random) {
                        System.out.println("Más, jej");
                    } else if (numero == random) {
                        System.out.println("Felicidades, lo lograste en " + aumento +" intentos");
                    } else {
                        System.out.println("ingresa un caracter válido");
                    }
                }
            }
            case 2 -> {
                System.out.print("¿En cuántos intentos adivinas el número?:\s");
                var intentos = consola.nextInt();
                while (numero != random && intentos > 0) {
                    intentos--;
                    aumento++;
                    System.out.print("Escribe el número:\s");
                    numero = consola.nextInt();
                    if (numero > random) {
                        System.out.println("Menos, jej");
                    } else if (numero < random) {
                        System.out.println("Más, jej");
                    } else if (numero == random) {
                        System.out.println("Felicidades" + "\n" + "Lo lograste en " + aumento + " intentos");
                    }
                    if (intentos == 0 && numero != random) {
                        System.out.println("Se te acabaron los intentos :(" + "\n"
                                + "Era el número: " + random);
                    }
                }
            }
            case 3 -> {
                System.out.println("""
                        Adivina el número random que está entre 0 y 20
                        Tienes 5 intentos para adivinar el número
                        """);
                int intentos = 5;
                while (numero != randomDificil && intentos > 0) {
                    intentos--;
                    aumento++;
                    System.out.print("Escribe el número:\s");
                    numero = consola.nextInt();
                    if (numero > randomDificil) {
                        System.out.println("Menos, jej");
                    } else if (numero < randomDificil) {
                        System.out.println("Más, jej");
                    } else if (numero == randomDificil) {
                        System.out.println("Felicidades" + "\n" + "Lo lograste en " + aumento + " intentos");
                    }
                    if (intentos == 0 && numero != randomDificil) {
                        System.out.println("Se te acabaron los intentos :(" + "\n"
                                + "Era el número: " + randomDificil);
                    }
                }
            }
        }
    }
}