package exercicio.uri.rebeca_lira;

import java.io.IOException;
import java.util.Scanner;

public class Ex1101 {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int M = scanner.nextInt();
        int N = scanner.nextInt();
        int maior, menor;
        int soma = 0;

        if (M > N) {
            maior = M;
            menor = N;
        } else {
            maior = N;
            menor = M;
        }

        while (M > 0 && N > 0) {
            for (int i = menor; i <= maior; i++) {

                System.out.print(i + " ");
                soma += i;
            }

            System.out.println("Sum = " + soma);
            soma = 0;
            M = scanner.nextInt();
            N = scanner.nextInt();
            if (M > N) {
                maior = M;
                menor = N;
            } else {
                maior = N;
                menor = M;
            }
        }
        scanner.close();
    }

}

