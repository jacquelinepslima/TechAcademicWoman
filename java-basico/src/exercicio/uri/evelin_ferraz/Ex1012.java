package exercicio.uri.evelin_inajara;
import java.util.Locale;
import java.util.Scanner;

public class Ex1012 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite três valores com ponto flutuantes: ");
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double trianguloArea = A * C / 2;
        double circuloRaio =  Math.PI * Math.pow(C, 2);
        double trapezioArea = (A + B) * C / 2;
        double quadradoArea = Math.pow(B, 2);
        double retanguloArea = A * B;


        System.out.printf("TRIANGULO = %.3f%n", trianguloArea);
        System.out.printf("CIRCULO = %.3f%n", circuloRaio);
        System.out.printf("TRAPÉZIO = %.3f%n", trapezioArea);
        System.out.printf("QUADRADO = %.3f%n",  quadradoArea);
        System.out.printf("RETÂNGULO = %.3f%n", retanguloArea);




        sc.close();
    }
}
