package exercicio.uri.alice_souza.util;

import java.util.Random;

public class ClassMath {
    public static void main(String[] args) {
        double x = 3.3;
        double y = 4.0;
        double z = 2.9;

        System.out.println("A raiz quadrada de " + x + " = " + Math.sqrt(x));
        System.out.println("A raiz quadrada de " + y + " = " + Math.sqrt(y));
        System.out.println("A raiz quadrada de " + z + " = " + Math.sqrt(z));
        System.out.println();
        System.out.println("Potência: " + x + " elevado a " + y + " = " + Math.pow(x, y));
        System.out.println("Potência: " + y + " elevado a " + z + " = " + Math.pow(y, z));
        System.out.println("Potência: " + z + " elevado a " + x + " = " + Math.pow(z, x));
        System.out.println();
        System.out.println("Número aleatório = " + Math.random());

        Random aleatorio = new Random();
        int numero = aleatorio.nextInt(30);
        System.out.println("Número aleatório com a classe Random = " + numero);
        System.out.println("Constante PI = " + Math.PI);
        System.out.println("O número absoluto de -30 = " + Math.abs(-30));
        System.out.println("arredondando valores: " + Math.round(2.86654));
    }
}
