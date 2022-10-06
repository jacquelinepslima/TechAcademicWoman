package exercicio.uri.alline_cardoso.util;

import java.util.Random;

public class ClassMath {
    public static void main(String[] args) {

        Random aleatorio = new Random();

        double x = 3.3; //variável declarada e inicializada com os valores
        double y = 4.0;
        double z = -2.9;

        double raizQuadradax, raizQuadraday, raizQuadradaValorFixo; //variável apenas declarada

        raizQuadradax = Math.sqrt(x);
        raizQuadraday = Math.sqrt(y);
        raizQuadradaValorFixo = Math.sqrt(25.0);

        System.out.println("Raiz quadrada");
        System.out.println("Raiz quadrada de "  + x + " = " + raizQuadradax);
        System.out.println("Raiz quadrada de "  + x + " = " + raizQuadraday);
        System.out.println("Raiz quadrada de 25 = " + raizQuadradaValorFixo);
        System.out.println();
        System.out.println();

        double potenciaXdeY= Math.pow(x,y);
        double potenciaXcomValorFixo = Math.pow(x,2);

        System.out.println("Potência");
        System.out.println(x + " elevado a " + y + " = " + potenciaXdeY);
        System.out.println(x + " elevado 2 " + potenciaXcomValorFixo);

        double numAleatorio = Math.random();
        System.out.println(numAleatorio);

        int num = aleatorio.nextInt(10);
        System.out.println("Número aletório com Classe Random => " + num);

        System.out.println("Aleatório com Math random => " + Math.round(Math.abs(Math.random() * 10)));

        double valorNegativo = -100.3;
        System.out.println("Valor absoluto de negativo " + Math.abs(valorNegativo));
        System.out.println("Valor absoluto de negativo arredondado " + Math.round(Math.abs(valorNegativo * 10)));
    }
}
