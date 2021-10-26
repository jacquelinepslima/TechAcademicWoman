package exercicio.uri.natasha_busnardo.util;

import java.util.Random;

public class ClasseMath {
    public static void main(String[] args) {
        double x = 3.3;
        double y = 4.0;
        double z = 2.9;

        double raizQuadradaX, raizQuadradaY, raizQuadradaZ;
        raizQuadradaX = Math.sqrt(x);
        raizQuadradaY = Math.sqrt(y);
        raizQuadradaZ = Math.sqrt(y);


        System.out.println("Raiz quadrada de " + x + " = " + raizQuadradaX);
        System.out.println("Raiz quadrada de " + y + " = " + raizQuadradaY);
        System.out.println("Raiz quadrada de " + z + " = " + raizQuadradaZ);

        double potenciaXdeY = Math.pow(x, y);
        double potenciaXcomValorFixo = Math.pow(x, 2);

        System.out.println("Potencia");
        System.out.println(x + " elevado a " + y + " = " + potenciaXdeY);
        System.out.println(x + " elevado a 2 = " + potenciaXcomValorFixo);

        System.out.println("Utilizando o random");
        double numeroAleatorio = Math.random();
        System.out.println("Aleatorio " + numeroAleatorio);
        System.out.println("Aleatorio FIXO " + Math.random());

        Random aleatorio = new Random();
        int numero = aleatorio.nextInt(10);
        System.out.println("Numero aleatorio com Classe Random => " + numero);

        System.out.println("Aleatorio com Math random => " + Math.round(Math.abs(Math.random() * 10)));

        double valorNegativo = -100.3;
        System.out.println("Valor absoluto de negativo " + Math.abs(valorNegativo));
        System.out.println("Valor absoluto de negativo aredondado " + Math.round(Math.abs(valorNegativo * 10)));
    }
}
