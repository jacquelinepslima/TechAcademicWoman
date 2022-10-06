package exercicio.uri.paula_santos.util;

import java.util.Random;

public class ClassRandom {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int numero = aleatorio.nextInt(10);
        System.out.println("Numero aleatorio com Classe Random =>" + numero);

        System.out.println("Aleatorio com Math random =>" + Math.round(Math.abs(Math.random()*10)));

        double valorNegativo = -100.3;
        System.out.println("Valor absoluto de negativo " + Math.abs(valorNegativo));

        System.out.println("Valor absoluto de negativo arredondado " + Math.round(Math.abs(valorNegativo)));
    }
}
