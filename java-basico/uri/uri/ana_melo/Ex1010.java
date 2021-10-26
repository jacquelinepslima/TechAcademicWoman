package exercicio.uri.ana_melo;

import java.util.Locale;
import java.util.Scanner;

public class Ex1010 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codPecas1 = sc.nextInt();
        int numPecas1= sc.nextInt();
        double valorUnPeca1 = sc.nextDouble();
        sc.nextLine();
        int codPecas2 = sc.nextInt();
        int numPecas2 = sc.nextInt();
        double valorUnPeca2 = sc.nextDouble();

        double valorTotal = numPecas1 * valorUnPeca1 + numPecas2 * valorUnPeca2;

        System.out.printf("VALOR A PAGAR: R$ %.2f", valorTotal);

        sc.close();
    }
}
