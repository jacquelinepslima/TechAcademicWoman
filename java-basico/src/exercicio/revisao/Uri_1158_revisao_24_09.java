package exercicio.revisao;

//Leia um valor inteiro N que é a quantidade de casos de teste que vem a seguir.
// Cada caso de teste consiste de dois inteiros X e Y. Você deve apresentar a soma de Y
// ímpares consecutivos a partir de X inclusive o próprio X se ele for ímpar. Por exemplo:
//        para a entrada 4 5, a saída deve ser 45, que é equivalente à: 5 + 7 + 9 + 11 + 13
//        para a entrada 7 4, a saída deve ser 40, que é equivalente à: 7 + 9 + 11 + 13


import java.util.Scanner;

public class Uri_1158_revisao_24_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int soma = 0;

        for (int i = 0; i < N; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if (x % 2 != 0) {
                soma = x;
                for (int j = 0; j < y - 1; j++) {
                    x += 2;
                    soma += x;
                }
                System.out.println(soma);
            } else {
                x = x + 1;
                for(int j = 0; j < y; j++){
                    soma += x;
                    x += 2;
                }
                System.out.println(soma);
            }

        }


    }


}
