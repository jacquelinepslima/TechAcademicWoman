package exercicio.uri.maressa_oliveira.util;

import java.util.Random;

public class ClasseMath {
    public static void main(String[] args) {

        //declarei as variáveis e inicializei os valores
        double x = 3.3;
        double y = 4.0;
        double z = -2.9;

        //somente declarei a variável
        double raizQuadradax,raizQuadraday,raizQuadradaValorFixo;

        raizQuadradax = Math.sqrt(x);
        raizQuadraday = Math.sqrt(y);
        raizQuadradaValorFixo = Math.sqrt(25.0);

        double cosseno = Math.cos(x);

        System.out.println("Raíz quadrada");
        System.out.println("Raíz quadrada de "+ x + " = "+ raizQuadradax);
        System.out.println("Raíz quadrada de "+ y + " = "+ raizQuadraday);
        System.out.println("Raíz quadrada de 25 = "+ raizQuadradaValorFixo);

        System.out.println();
        System.out.println();

        double potenciaXdeY = Math.pow(x,y);
        double potenciaXcomValorFixo = Math.pow(x,2);

        System.out.println("Potência");
        System.out.println(x + " elevado a "+y+" = "+potenciaXdeY);
        System.out.println(x + " elevado a 2 = "+potenciaXcomValorFixo);

        System.out.println("Utilizando o randow");
        System.out.println("Aleatório com o erro do Alicio "+Math.random());
        System.out.println("Aleatório FIXO com o erro do Alicio "+Math.random());
        System.out.println("Peço perdão JACQUE "+Math.random());


        Random aleatorio = new Random();
        int numero = aleatorio.nextInt(10);
        System.out.println("Número aleatório com Classe Random => "+numero);
        System.out.println("Aleatorio com Math random => "+Math.round(Math.abs(Math.random()*10)));

        double valorNegativo = -100.3;
        System.out.println("Valor absoluto de negativo "+ Math.abs(valorNegativo));
        System.out.println("Valor absoluto de negativo arredondado "+ Math.round(Math.abs(valorNegativo*10)));

        double valorPi = 3.14159;
        double valorPIMath = Math.PI;


    }
}
