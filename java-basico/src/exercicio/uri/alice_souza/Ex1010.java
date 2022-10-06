package exercicio.uri.alice_souza;

import java.util.Locale;
import java.util.Scanner;

public class Ex1010 {
    public static void main(String[] args) {
        int cod1, qte1, cod2, qte2;
        double valor1, valor2;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        cod1 = sc.nextInt();
        qte1 = sc.nextInt();
        valor1 = sc.nextDouble();
        cod2 = sc.nextInt();
        qte2 = sc.nextInt();
        valor2 = sc.nextDouble();
        System.out.printf("VALOR A PAGAR: R$ %.2f",(qte1*valor1 + qte2*valor2));



    }
}
