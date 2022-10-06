package exercicio.uri.amanda_medeiros.util;

public class ClassMath {
    public static void main(String[] args) {
        double x = 3.3;
        double y = 4.0;
        double z = 2.9;

        double raizQuadradaX, raizQuadradaY, raizQuadradaZ, raizQuadradaValorFixo;

        raizQuadradaX = Math.sqrt(x);
        raizQuadradaY = Math.sqrt(y);
        raizQuadradaZ = Math.sqrt(z);
        raizQuadradaValorFixo = Math.sqrt(25.0);

        System.out.println("Raiz quadrada de X" + " = " + raizQuadradaX);
        System.out.println("Raiz quadrada de Y" + " = " + raizQuadradaY);
        System.out.println("Raiz quadrada de Z" + " = " + raizQuadradaZ);
        System.out.println("Raiz quadrada de 25 = " + raizQuadradaValorFixo);

        System.out.println();
        System.out.println();

        double potenciaXdeY = Math.pow(x,y);
        double potenciaXcomValorFixo = Math.pow(x,2);

        System.out.println("Potencia");
        System.out.println(x + " elevado a " + y + " = " + potenciaXdeY);
        System.out.println(x + " elevado a 2 " + potenciaXcomValorFixo);

        double numeroAleatorio = Math.random();

        System.out.println("Aleatorio com o erro do alicio " + numeroAleatorio);
        System.out.println("Aleatorio FIXO com o erro do alicio " + Math.random());
    }
}
