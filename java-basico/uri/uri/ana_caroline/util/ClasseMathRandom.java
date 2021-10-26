package exercicio.uri.ana_caroline.util;

import java.util.Random;

public class ClasseMathRandom {

    public static void main(String[] args) {

        double x = 3.3;
        double y = 4.0;
        double z = -2.9; //declarar e inicializar ao mesmo tempo está fora do padrao

        double raizQuadradaX, raizQuadradaY, raizQuadradaValorFixo, potenciaXdeY, potenciaXcomValorFixo; 
        
        raizQuadradaX = Math.sqrt(x);
        raizQuadradaY = Math.sqrt(y);
        raizQuadradaValorFixo = Math.sqrt(25.0);

        System.out.println("Raiz quadrada:");
        System.out.println("Raiz quadrada de " + x + " = " + raizQuadradaX);
        System.out.println("Raiz quadrada de " + y + " = " + raizQuadradaY);
        System.out.println("Raiz quadrada de 25 = " + raizQuadradaValorFixo);

        System.out.println();
        System.out.println();
        
        potenciaXdeY = Math.pow(x,y);
        potenciaXcomValorFixo = Math.pow(x,2);

        System.out.println("Potencia:");
        System.out.println(x + " elevado a " + y + " = " + potenciaXdeY);
        System.out.println(x + " elevado a 2 = " + potenciaXcomValorFixo);

        System.out.println();
        System.out.println("Numero aleatorio: " + Math.random());

        Random aleatorio = new Random();
        int numero = aleatorio.nextInt(10);
        System.out.println("Numero aleatorio com Classe Random => " + numero);

        System.out.println("Numeo aleatorio com Math Random => " + Math.round(Math.abs(Math.random() * 10)));

        double valorNegativo = -100.3;
        System.out.println("Valor absoluto de negativo = " + Math.abs(valorNegativo));
        System.out.println("Valor absoluto de negativo arredondado = " + Math.round(Math.abs(valorNegativo * 10)));

    }
}
