package exercicio.uri.alline_cardoso;

import java.util.Locale;
import java.util.Scanner;

public class Ex1010 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner (System.in);

        int cod1 = scan.nextInt();
        int pc1 = scan.nextInt();
        double vlr1 = scan.nextDouble();
        int cod2 = scan.nextInt();
        int pc2 = scan.nextInt();
        double vlr2 = scan.nextDouble();

        double vlrPagar = (pc1 * vlr1) + (pc2 * vlr2);

        System.out.printf("R$ = %.2f", vlrPagar);
        System.out.println();


        scan.close();
    }
}
