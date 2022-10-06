package exercicio.uri.samyra_figueiredo;

import java.util.Locale;
import java.util.Scanner;

public class Ex1038 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo = sc.nextInt();
        int qtd = sc.nextInt();
        double preco = 0.0;

        switch (codigo) {
            case 1:
                preco = qtd * 4.00;
                break;
            case 2:
                preco = qtd * 4.50;
                break;
            case 3:
                preco = qtd * 5.00;
                break;
            case 4:
                preco = qtd * 2.00;
                break;
            case 5:
                preco = qtd * 1.50;
                break;
            default:
                System.out.println("Codigo Invalido");
        }

        System.out.printf("Total: R$ %.2f", preco);

        sc.close();
    }
}
