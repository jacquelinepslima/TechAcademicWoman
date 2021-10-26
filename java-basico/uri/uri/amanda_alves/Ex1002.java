package exercicio.uri.amanda_alves;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1002 {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        //DecimalFormat decimal = new DecimalFormat("0.0000");

        double raio = scanner.nextDouble();
        double A = Math.PI * Math.pow(raio, 2);
//        double n = 3.14159;
//        double A = n * (raio * raio);
//        System.out.println("A=" + decimal.format(A));
        System.out.printf("A= %.4f%n", A);
    }
}