package exercicio.uri.ana_cruz;

import java.util.Scanner;

public class Ex1038{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigo = scanner.nextInt();
        int qtde = scanner.nextInt();

        double total;

        switch (codigo){
            case 1:
                total = qtde*4.0;
                break;
            case 2:
                total = qtde*4.5;
                break;
            case 3:
                total = qtde*5.0;
                break;
            case 4:
                total = qtde*2.0;
                break;
            case 5:
                total = qtde*1.5;
                break;
            default:
                total = 0.0;
                break;
        }

        System.out.printf("TOTAL: R$ %.2f", total);

        scanner.close();
    }
}
