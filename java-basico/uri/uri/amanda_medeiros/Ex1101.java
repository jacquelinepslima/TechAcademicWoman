package exercicio.uri.amanda_medeiros;

import java.util.Scanner;

public class Ex1101 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int M = 1;
        int N = 1;
        int soma = 0;
        String resultado = "";

        while (M != 0 && N != 0) {
            soma = 0;
            resultado = "";
            M = scanner.nextInt();
            N = scanner.nextInt();
            for (int i = M; i >= N; i--) {

                resultado += i + " ";
                soma += i;

            }
            if (M != 0 && N != 0) {
                System.out.println(resultado + "Sum=" + soma);
            }
        }
    }
}
