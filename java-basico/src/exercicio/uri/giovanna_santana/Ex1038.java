package exercicio.uri.giovanna_santana;


import java.util.Scanner;

public class Ex1038 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigoItem = scanner.nextInt();
        ;
        int quantidadeItem = scanner.nextInt();

        double valorTotal = 0.00;

        switch (codigoItem) {
            default:
                System.out.println("Opção inválida");
                break;
            case 1:
                valorTotal = quantidadeItem * 4.00;
                break;
            case 2:
                valorTotal = quantidadeItem * 4.50;
                break;
            case 3:
                valorTotal = quantidadeItem * 5.00;
                break;
            case 4:
                valorTotal = quantidadeItem * 2.00;
                break;
            case 5:
                valorTotal = quantidadeItem * 1.50;
                break;
        }
        System.out.printf("Total: R$ %.2f", valorTotal);

    }
}
