package exercicio.uri.ambrosia_andrade.util;

import java.util.Random;

public class ClasseMath {
    public static void main(String[] args){
        double x = 3.3, y = 4.0, z = -2.9;
        double raisQuadradaX = Math.sqrt(x), raisQuadradaY = Math.sqrt(y);
        double raisQuadradaZ = Math.sqrt(z), raizQuadradaValorFixo = Math.sqrt(25.0);

        System.out.println("Raiz quadrada");
        System.out.println("Raiz quadrada de " + x + " = " + raisQuadradaX);
        System.out.println("Raiz quadrada de " + y + " = " + raisQuadradaY);
        System.out.println("Raiz quadrada de " + z + " = " + raisQuadradaZ);

        System.out.println();

        double potenciaXdeY = Math.pow(x, y);
        double potenciaXcomValorFixo = Math.pow(x, 2);

        System.out.println("Potência");
        System.out.println(x + " elevado a " + y + " = " + potenciaXdeY);
        System.out.println(x + " elevado a 2 = " + potenciaXcomValorFixo);

        double numeroAleatorio = Math.random();

        System.out.println("Aleatório com erro do Alicio " + numeroAleatorio);
        System.out.println("Aleatório FIXO com erro do Alicio " + Math.random());
        System.out.println("Peço perdão JACQUE");

        Random aleatorio = new Random();
        int numero = aleatorio.nextInt(10);
        System.out.println("Número aleatório com classe random => " + numero);
        System.out.println("Aleatório com Math random => " + Math.round(Math.abs(Math.random() * 10)));

        double valorNegativo = -100.3;
        System.out.println("Valor absoluto de negativo " + Math.abs(valorNegativo));
        System.out.println("Valor absoluto de negativo arredondado " + Math.round(Math.abs(valorNegativo)));
    }
}
