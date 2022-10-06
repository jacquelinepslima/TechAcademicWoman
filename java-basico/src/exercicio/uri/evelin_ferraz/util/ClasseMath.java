package exercicio.uri.evelin_ferraz.util;
import java.util.Random;

public class ClasseMath {
    public static void main(String[] args) {

        //declarei as variaveis e inicializei os valores
        double x = 3.3;
        double y = 4.0;
        double z = -2.9;

        //somente declarei a variavel
        double raizQuadradaX, raizQuadradaY,
                raizQuadradaValorFixo, potenciaXdeY,
                potenciaXValorFixo, numeroAleatorio;

        //Processamento
        raizQuadradaX= Math.sqrt(x);
        raizQuadradaY= Math.sqrt(y);
        raizQuadradaValorFixo = Math.sqrt(25.0);

        potenciaXdeY = Math.pow(x, y);
        potenciaXValorFixo = Math.pow(x, 2);

        numeroAleatorio = Math.random();

        //Saídas
        System.out.println("Raiz quadrada de " + x + " = " + raizQuadradaX);
        System.out.println("Raiz quadrada de " + y + " = " + raizQuadradaY);
        System.out.println("Raiz quadrada de " + x + " = " + raizQuadradaValorFixo);
        System.out.println("Raiz quadrada de 25  = " + raizQuadradaValorFixo);

        System.out.println();
        System.out.println();

        System.out.println("Potência");
        System.out.println(x + " elevado a " + y + " = " + potenciaXdeY);
        System.out.println(x + " elevado a 2 = " + potenciaXValorFixo);

        System.out.println();
        System.out.println();

        System.out.println("Aleatório: " + numeroAleatorio);
        System.out.println("Aleatório com o número fixo: " + Math.random());

        Random aleatorio = new Random();
        int numero = aleatorio.nextInt(10);
        System.out.println("Numero aleatorio com Classe Random => " + numero);

        System.out.println("Aleatorio com Math random => " + Math.round(Math.abs(Math.random() * 10)));

        double valorNegativo = -100.3;
        System.out.println("Valor absoluto de negativo " + Math.abs(valorNegativo));
        System.out.println("Valor absoluto de negativo arredondado: " + Math.round(Math.abs(valorNegativo * 10)));

    }
}
