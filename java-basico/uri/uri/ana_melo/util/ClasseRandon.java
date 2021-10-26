package exercicio.uri.ana_melo.util;

import java.util.Random;

public class ClasseRandon {
    public static void main(String[] args) {
        System.out.println("Utilizando randon");
        double numeroAleatorio = Math.random();
        System.out.println("Aleatorio " + numeroAleatorio);
        System.out.println("Aleatorio Fixo " + Math.random());

        Random aleatorio = new Random();
        int numero = aleatorio.nextInt(10);
        System.out.println("Numero aleatorio com Classe Random => " + numero);

        System.out.println("Aleatorio com Math random => " + Math.round(Math.abs(Math.random() * 10)));

        double valorNegativo = -100.3;
        System.out.println("Valor absoluto de negativo " + Math.abs(valorNegativo));
        System.out.println("Valor absoluto de negativo aredondado " + Math.round(Math.abs(valorNegativo * 10)));

    }
}
