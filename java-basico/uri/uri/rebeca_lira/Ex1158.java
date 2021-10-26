package exercicio.uri.rebeca_lira;

import java.util.Scanner;

public class Ex1158 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Ntestes = scanner.nextInt();
        int soma = 0;

        for (int i = 1; i <= Ntestes; i++) {
            int X = scanner.nextInt();
            int Y = scanner.nextInt();

            while (Y != 0) {
                if (X % 2 != 0) {
                    soma += X;
                    X++;
                    Y--;
                } else {
                    X++;
                }
            }
            System.out.println(soma);
            soma = 0;


        } scanner.close();
    }
}
