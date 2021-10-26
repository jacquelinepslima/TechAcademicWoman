package exercicio.uri.ana_melo.util;

public class ClasseMath {
    public static void main(String[] args) {
        //declarei as variaveis e inicializei os valores
        double x = 3.3;
        double y = 4.0;
        double z = -2.9;

        //somente declarei as variaveis
        double raizQuadradaX, raizQuadradaY, raizQuadradaValorFixo;

        raizQuadradaX = Math.sqrt(x);
        raizQuadradaY = Math.sqrt(y);
        raizQuadradaValorFixo = Math.sqrt(25.0);

        System.out.println("Raiz quadrada de " + x + " = " + raizQuadradaX);
        System.out.println("Raiz quadrada de " + y + " = " + raizQuadradaY);
        System.out.println("Raiz quadrada de 25 = " + raizQuadradaValorFixo);

        System.out.println();

        double potenciaXdeY = Math.pow(x,y);
        double potenciaXcomValorFixo = Math.pow(x,2);

        System.out.println("Potencia:");
        System.out.println(x + " elevado a " + y + " = " + potenciaXdeY);
        System.out.println(x + " elevado a " + 2 + " = " + potenciaXcomValorFixo);

    }
}
