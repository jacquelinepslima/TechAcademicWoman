package exercicio.uri.paula_santos.util;

public class ClasseMath {

    public static void main(String[] args) {
        //criei as variaveis e inicializei os valores.
        double x = 3.3;
        double y = 4.0;

        //somente declarei a variavel
        double raizQuadradaX, raizQuadradaY, raizQuadradaValorFixo;

        raizQuadradaX = Math.sqrt(x);
        raizQuadradaY = Math.sqrt(y);
        raizQuadradaValorFixo = Math.sqrt(25.0);

        System.out.println("Raiz Quadrada de " + x + " = " + raizQuadradaX);
        System.out.println("Raiz Quadrada de " + y + " = " + raizQuadradaY);
        System.out.println();

        double potenciaXdeY = Math.pow(x,y);
        double potenciaXcomValorFixo = Math.pow(x,2);

        System.out.println("Potencia");
        System.out.println(x + " elevado a " + y + " = " + potenciaXdeY);
        System.out.println(x + " elevado a 2 = " + potenciaXcomValorFixo);

        double numeroAleatorio = Math.random();

        System.out.println("Aleatorio: " + numeroAleatorio);
        System.out.println("Aleatorio: " + Math.random());

    }

}
