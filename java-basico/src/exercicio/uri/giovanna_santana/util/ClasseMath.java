package exercicio.uri.giovanna_santana.util;

import java.util.Random;

public class ClasseMath {
    public static void main(String[] args) {

        double x = 3.3;
        double y = 4.0;
        double z = -2.9;

        //
        double raizQuadradaX, raizQuadradaY, raizQuadradaValorFixo;

        raizQuadradaX = Math.sqrt(x);
        raizQuadradaY = Math.sqrt(y);
        raizQuadradaValorFixo = Math.sqrt(25.0);

        System.out.println("Raiz Quadrada");
        System.out.println("Raiz quadrada de " + x + " = " + raizQuadradaX);
        System.out.println("Raiz quadrada de " + x + " = " + raizQuadradaY);
        System.out.println("Raiz quadrada de 25" + " = " + raizQuadradaValorFixo);

        System.out.println();
        System.out.println();

        double potenciaXdeY = Math.pow(x,y);
        double potenciaXcomValorFixo = Math.pow(x,2);

        System.out.println("Potencia");
        System.out.println(x + " elevado a " + y + " = " + potenciaXdeY);
        System.out.println(x + " elevado a 2 " + potenciaXcomValorFixo);

        System.out.println();
        System.out.println();

        double numeroAleatorio = Math.random();

        System.out.println("Numero aleatorio");
        System.out.println("Numero aleatorio: " + numeroAleatorio);
        System.out.println("Numero aleatorio FIXO " + Math.random());

        System.out.println();

        Random aleatorio = new Random();
        int numero = aleatorio.nextInt(10);
        System.out.println("Numero aleatorio com Classe Random => " + numero);

        System.out.println("Aleatorio com Math random => " + Math.round(Math.abs(Math.random() * 10)));

        double valorNegativo = -100.3;
        System.out.println("Valor absoluto de negativo " + Math.abs(valorNegativo));
        System.out.println("Valor absoluto de negativo arredondado " + Math.round(Math.abs(valorNegativo * 10)));



    }
}
