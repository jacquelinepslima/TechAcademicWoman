package exercicio.uri.byanca_calixto;

import java.util.Locale;
import java.util.Scanner;

public class Ex1038 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int codigo = scanner.nextInt();
        int qtd = scanner.nextInt();

        double preco = 0;
        double total = 0;

        if (codigo == 1) {
            preco = 4.00;
        } else if (codigo == 2) {
            preco = 4.50;
        } else if (codigo == 3) {
            preco = 5.00;
        } else if (codigo == 4) {
            preco = 2.00;
        } else if (codigo == 5) {
            preco = 1.50;
        } else {
            System.out.println("Código inválido");
        }

        total = (preco * qtd);
        System.out.printf("Total: R$ %.2f", total);

        scanner.close();

    }
}
