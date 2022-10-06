package exercicio.uri.valquiria_matter.util;

import java.util.Random;

public class ClassMath {

    public static void main(String[] args) {

        double x, y, z;
        double raizQuadradaX, raizQuadradaY, raizQuadradaValorFixo;

        x = 3.3;
        y = 4.0;
        z = -9;

        raizQuadradaX = Math.sqrt(x);
        raizQuadradaY = Math.sqrt(y);
        raizQuadradaValorFixo = Math.sqrt(25.0);

        System.out.println("Raiz Quadrada");
        System.out.println("Raiz Quadrada de " + x + raizQuadradaX);
        System.out.println("Raiz Quadrada de " + y + raizQuadradaY);
        System.out.println("Raiz Quadrada de 25 " + raizQuadradaValorFixo);

        System.out.println();
        System.out.println();

        double potenciaXdeY = Math.pow(x,y);
        double potenciaXcomValorFixo = Math.pow(x,2);

        System.out.println("Potencia: ");
        System.out.println( x + " elevado a " + y + " = " + potenciaXdeY);
        System.out.println( x + " elevado a 2 = " + potenciaXcomValorFixo);

        System.out.println("Numeros Aleatorios: ");
        double numeroAleatorio = Math.random();
        System.out.println("Aleatorio: " + numeroAleatorio);
        System.out.println("Aleatorio FIXO: " + Math.random());

        Random random = new Random();
        System.out.println("Numero Aleatorio com Random: " + random.nextInt(10));

        double valorNegativo = -100.3;

        System.out.println("Valor absoluto do negativo:  " + Math.abs(valorNegativo));
        System.out.println("Valor abslotuto de negativo arrendondado: " + Math.round(Math.abs(valorNegativo)));
















    }
}
