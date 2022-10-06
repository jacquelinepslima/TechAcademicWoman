package exercicio.uri.ana_cruz.util;

import java.util.Random;

public class ClasseMath {
    public static void main(String[] args) {
        double x = 3.3;
        double y = 4.0;
        double z = -2.9;

        double raizQuadradaX, raizQuadradaY, raizQuadradaValorFixo;

        raizQuadradaX = Math.sqrt(x);
        raizQuadradaY = Math.sqrt(y);
        raizQuadradaValorFixo = Math.sqrt(25.0);

        System.out.println("Raiz quadrada");
        System.out.println("Raiz quadrada de "+ x +" = "+ raizQuadradaX);
        System.out.println("Raiz quadrada de "+ y +" = "+ raizQuadradaY);
        System.out.println("Raiz quadrada de "+ 25.0 +" = "+ raizQuadradaValorFixo);

        System.out.println();
        System.out.println();

        double potenciaXdeY = Math.pow(x,y);
        double potenciaXdeValorFixo = Math.pow(x,2);

        System.out.println("Potencia");
        System.out.println(x + " elevado a " + y + " = " + potenciaXdeY);
        System.out.println(x + " elevado a 2 = " + potenciaXdeValorFixo);
        System.out.println();

        System.out.println("Utilizacao da random:");
        double numAleatorio = Math.random();
        System.out.println("Aleatorio " + numAleatorio);
        System.out.println("Aleatorio FIXO " + Math.random());

        Random aleatorio = new Random();
        int numero = aleatorio.nextInt(10);
        System.out.println("Numero aleatorio com a classe Random => " + numero);
        System.out.println("Alatorio com Math random => " + Math.round(Math.abs(Math.random()*10)));

        double valorNegativo = -100.3;
        System.out.println("Valor absoluto de negativo " + Math.abs(valorNegativo));
        System.out.println("Valor absoluto de negativo arredondado " + Math.round(Math.abs(valorNegativo)));

    }
}
