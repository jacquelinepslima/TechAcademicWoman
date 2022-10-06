package exercicio.uri.palloma_soares.util;

import java.util.Random;

public class ClasseMath {
    public static void main(String[] args) {

        Random random = new Random();

        double x = 3.3;
        double y = 4.0;
        double z = -2.9;

        double raizQuadradaX, raizQuadradaY, raizQuadradaZ, raizQuadradaValorFixo;
        double numeroAleatorio;

        raizQuadradaX = Math.sqrt(x);
        raizQuadradaY = Math.sqrt(y);
        raizQuadradaZ = Math.sqrt(z);
        raizQuadradaValorFixo = Math.sqrt(25.0);

        System.out.println("Raiz quadrada de "+x+" = "+raizQuadradaX);
        System.out.println("Raiz quadrada de "+y+" = "+raizQuadradaY);
        System.out.println("Raiz quadrada de "+z+" = "+raizQuadradaZ);
        System.out.println("Raiz quadrada de 25 = "+raizQuadradaValorFixo);

        System.out.println();
        System.out.println();

        double potenciaXdeY = Math.pow(x,y);
        double potenciaXcomValorFixo = Math.pow(x,2);

        System.out.println("Potencia");
        System.out.println(x+" elevado a "+y+" = "+potenciaXdeY);
        System.out.println(x+" elevado a 2 = "+potenciaXcomValorFixo);

        System.out.println();
        System.out.println();

        numeroAleatorio = Math.random();

        System.out.println("Número aleatório");
        System.out.println("1 -> "+numeroAleatorio);
        System.out.println("2 -> "+Math.random());

        System.out.println();
        System.out.println();

        //Random random = new Random();

        int num = random.nextInt(10);
        System.out.println("Numero aleatótio com Class Random => "+num);
        System.out.println("Aleatorio com Math random => "+ Math.round(Math.abs(Math.random() * 10)));

        double valorNegativo = -100.3;

        System.out.println("Valor absoluto de negativo "+Math.abs(valorNegativo));
        System.out.println("Valor absoluto de negativo aredondado " +Math.round(Math.abs(valorNegativo)));
    }
}
