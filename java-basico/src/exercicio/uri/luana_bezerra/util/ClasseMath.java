package exercicio.uri.luana_bezerra.util;

import java.util.Random;

public class ClasseMath {
    public static void main(String[] args) {

        //variáveis declaradas e valores inicializados
        double x = 3.3;
        double y = 4.0;
        double z = -2.9;

        //somente declaração da variável
        double raizQuadradaX, raizQuadradaY, raizQuadradaValorFixo;

        raizQuadradaX = Math.sqrt(x);
        raizQuadradaY = Math.sqrt(y);
        raizQuadradaValorFixo = Math.sqrt(25.0);

        System.out.println("Raiz quadrada:");
        System.out.println("Raiz quadrada de " + x + " = " + raizQuadradaX);
        System.out.println("Raiz quadrada de " + y + " = " + raizQuadradaY);
        System.out.println("Raiz quadrada de 25 = " + raizQuadradaValorFixo);

        System.out.println();
        System.out.println();

        //3.3 elevado a 4.0
        double potenciaXdeY = Math.pow(x, y);
        double potenciaXcomValorFixo = Math.pow(x,2);

        System.out.println("Potência:");
        System.out.println(x + " elevado a " + y + " = " + potenciaXdeY);
        System.out.println(x + " elevado a 2 = " + potenciaXcomValorFixo);

        System.out.println();
        System.out.println();

        System.out.println("Utilizando o random:");
        double numeroAleatorio = Math.random();
        System.out.println("Aleatório: " + numeroAleatorio);
        System.out.println("Aleatório fixo: " + Math.random());

        Random aleatorio = new Random();
        int numero = aleatorio.nextInt(10); //Clase
        System.out.println("Número aleatório com Classe Random => " + numero);

        System.out.println("Aleatório com Math random => " + Math.random() * 10);

        System.out.println("Aleatório com Math random => " + Math.round(Math.abs(Math.random() * 10))); //VALOR ABSOLUTO
        //1 - 10

        double valorNegativo = -2.3;
        System.out.println("Valor absoluto de negativo " + Math.abs(valorNegativo)); //valor absoluto
        System.out.println("Valor absoluto arredondado " + Math.round(Math.abs(valorNegativo * 10)));

        double valorPi = 3.14159;
        double valorPiMath = Math.PI;

    }
}
