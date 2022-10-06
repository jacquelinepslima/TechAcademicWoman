package exercicio.uri.bruna_lima;

import java.util.Scanner;

public class Ex1038 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int codigo = entrada.nextInt();
        int quant = entrada.nextInt();
        double total = 0.0;

        switch (codigo) {

            case 1:
                total = quant * 4.00;
                break;
            case 2:
                total = quant * 4.50;
                break;
            case 3:
                total = quant * 5.00;
                break;
            case 4:
                total = quant * 2.00;
                break;
            case 5:
                total = quant * 1.50;
                break;
            default:
                System.out.println("Produto não encontrado!");
                break;
        }
        System.out.printf("Total: R$ %.2f%n", total);
    }
}
