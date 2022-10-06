package exercicio.uri.rebeca_lira.util;

import java.util.Random;

public class ClasseMathERandom {
    public static void main(String[] args) {

        double x = 3.3;
        double y = 4.0;
        double z = -2.9;
        double raizQuadradaX, raizQuadradaY, raizQuadradaZ;

        raizQuadradaX = Math.sqrt(x);
        raizQuadradaY = Math.sqrt(y);
        raizQuadradaZ = Math.sqrt(z);

        System.out.println("Raiz quadrada");
        System.out.println("Raiz quadrada de " + x + " = " + raizQuadradaX);
        System.out.println("Raiz quadrada de " + y + " = " + raizQuadradaY);
        System.out.println("Raiz quadrada de " + z + " = " + raizQuadradaZ);
        System.out.println();
        System.out.println();

        double potenciaXdeY = Math.pow(x,y);
        double potenciaXcomValorFixo = Math.pow(x,2);

        System.out.println("Potência");
        System.out.println(x + " elevado a " + y + " = " + potenciaXdeY);
        System.out.println(x + " elevado a 2 = " + potenciaXcomValorFixo);

        Random aleatorio = new Random();
        int numero = aleatorio.nextInt(10);
        System.out.println("Número aleatório com Classe Random -> " + numero);
        System.out.println("Aleatório com Math Random -> " + Math.round(Math.abs(Math.random() * 10)));

        double valorNegativo = -100.3;
        System.out.println("Valor absoluto de negativo " + Math.abs(valorNegativo));

    }
}
