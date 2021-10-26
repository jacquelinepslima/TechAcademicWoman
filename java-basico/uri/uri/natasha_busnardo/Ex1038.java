package exercicio.uri.natasha_busnardo;

import java.util.Locale;
import java.util.Scanner;

public class Ex1038 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int cod = scan.nextInt();
        int qtd = scan.nextInt();
        double total = 0;

        switch (cod) {
            case 1:
                total = qtd * 4.00;
                break;
            case 2:
                total = qtd * 4.50;
                break;
            case 3:
                total = qtd * 5.00;
                break;
            case 4:
                total = qtd * 2.00;
                break;
            case 5:
                total = qtd * 1.50;
                break;
        }

        System.out.printf("Total: R$ %.2f", total);


        scan.close();
    }
}
