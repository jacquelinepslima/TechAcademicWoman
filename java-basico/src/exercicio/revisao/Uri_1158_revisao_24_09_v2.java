package exercicio.revisao;

//Leia um valor inteiro N que é a quantidade de casos de teste que vem a seguir.
// Cada caso de teste consiste de dois inteiros X e Y. Você deve apresentar a soma de Y
// ímpares consecutivos a partir de X inclusive o próprio X se ele for ímpar. Por exemplo:
//        para a entrada 4 5, a saída deve ser 45, que é equivalente à: 5 + 7 + 9 + 11 + 13
//        para a entrada 7 4, a saída deve ser 40, que é equivalente à: 7 + 9 + 11 + 13


import java.util.Scanner;

public class Uri_1158_revisao_24_09_v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            int soma = 0;
            int cont = 0;

            for (int j = x; cont < y; j++) {
                if (j % 2 != 0) {
                    soma += j;
                    cont += 1;
                }
            }
            System.out.println(soma);

        }


    }


}
