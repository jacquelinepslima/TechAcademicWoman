package exercicio.uri.ana_melo;

import java.util.Scanner;

public class Ex1038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigo, qntItem;
        double precoTotal = 0;

        codigo = sc.nextInt();
        qntItem = sc.nextInt();

        switch (codigo){
            case 1:
                precoTotal = 4.00 * qntItem;
                break;
            case 2:
                precoTotal = 4.50 * qntItem;
                break;
            case 3:
                precoTotal = 5.00 * qntItem;
                break;
            case 4:
                precoTotal = 2.00 * qntItem;
                break;
            case 5:
                precoTotal = 1.50 * qntItem;
                break;
        }
        System.out.printf("Total = R$ %.2f%n", precoTotal);

        sc.close();
    }
}
