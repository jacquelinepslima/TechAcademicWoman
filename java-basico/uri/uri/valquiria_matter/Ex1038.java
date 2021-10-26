package exercicio.uri.valquiria_matter;

import java.util.Locale;
import java.util.Scanner;

public class Ex1038 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scan = new Scanner(System.in);

        int codigo = scan.nextInt();
        int quantidade = scan.nextInt();

        int precoUnitario;

        double total = 0.0;

        if (codigo == 1) {
            total = quantidade * 4.00;
        } else if (codigo == 2) {
            total = quantidade * 4.50;
        } else if (codigo == 3) {
            total = quantidade * 5.00;
        } else if (codigo == 4) {
            total = quantidade * 2.00;
        } else if (codigo == 5) {
            total = quantidade * 1.50;
        } else {
            System.out.println("Código Inválido.");
        }

        System.out.printf("Total: R$ %.2f", total);

    }
}

