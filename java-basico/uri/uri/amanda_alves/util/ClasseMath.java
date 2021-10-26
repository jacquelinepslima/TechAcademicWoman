package exercicio.uri.amanda_alves.util;

import java.util.Random;

public class ClasseMath {
    public static void main(String[] args) {

        double x = 3.3;
        double y = 4.0;
        double z = 2.9;

        double raizQuadradaX, raizQuadradaY, raizQuadradaValorFixo;

        raizQuadradaX = Math.sqrt(x);
        raizQuadradaY = Math.sqrt(y);
        raizQuadradaValorFixo = Math.sqrt(25.0);

        System.out.println("Raiz quadrada de " + x + " = " + raizQuadradaX);
        System.out.println("Raiz quadrada de " + y + " = " + raizQuadradaY);
        System.out.println("Raiz quadrada de 25.0 = " + raizQuadradaValorFixo);

        double potenciaXdeY = Math.pow(x, y);
        double potenciaXcomValorFixo = Math.pow(x, 2);

        System.out.println("\n\nPotencia");
        System.out.println(x + " elevado a " + y + " = " + potenciaXdeY);
        System.out.println(x + " elevado a 2 = " + potenciaXcomValorFixo);

        double numAleatorio = Math.random();

        System.out.println("\n\nAleatorio " + numAleatorio);
        System.out.println("Aleatorio " + Math.random());

        Random aleatorio = new Random();
        int numero = aleatorio.nextInt(10);
        System.out.println("\n\nNumero aleatorio com classe random: " + numero);

        System.out.println("Aleatorio com Math random: " + Math.round(Math.abs(Math.random() * 10)));

        double valorNegativo = -100.3;
        System.out.println("\n\nValor absoluto de negativo " + Math.abs(valorNegativo));

        System.out.println("Valor absoluto de negativo arredondado " + Math.round(Math.abs(valorNegativo)));
        ;
    }
}
