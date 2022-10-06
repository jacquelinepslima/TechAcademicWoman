package exercicio.uri.ana_caroline;


import java.util.Locale;
import java.util.Scanner;

public class Ex1010 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codPeca1 = sc.nextInt();
        int qntPecas1 = sc.nextInt();
        double valorPeca1 = sc.nextDouble();

        int codPeca2 = sc.nextInt();
        int qntPecas2 = sc.nextInt();
        double valorPeca2 = sc.nextDouble();

        double totPagar = qntPecas1 * valorPeca1 + qntPecas2 * valorPeca2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", totPagar);



        sc.close();
    }
}
