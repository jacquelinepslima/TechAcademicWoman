package exercicio.uri.ambrosia_andrade;

import java.util.Scanner;

public class Ex1010 {
    public static void main(String[] args){

        int codigo, numPecas;
        float valorUnitario, total = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 2; i++){
            codigo = scanner.nextInt();
            numPecas = scanner.nextInt();
            valorUnitario = scanner.nextFloat();
            total += numPecas * valorUnitario;
        }

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

        scanner.close();
    }
}
