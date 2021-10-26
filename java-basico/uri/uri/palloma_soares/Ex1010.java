package exercicio.uri.palloma_soares;

import java.util.Locale;
import java.util.Scanner;

public class Ex1010 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo1 = sc.nextInt();
        int qntPeca1 = sc.nextInt();
        double vlUnitario1 = sc.nextDouble();

        int codigo2 = sc.nextInt();
        int qntPeca2 = sc.nextInt();
        double vlUnitario2 = sc.nextDouble();

        double valorTotal = (qntPeca1*vlUnitario1 + qntPeca2*vlUnitario2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotal);

        sc.close();
    }
}
