package exercicio.uri.giovanna_santana;

import java.util.Scanner;

//
//leia 4 valores inteiros A, B, C e D.
//        se B for maior do que C
//        e se D for maior do que A,
//        e a soma de C com D for maior que a soma de A e B
//        e se C e D, ambos, forem positivos
//        e se a variável A for par escrever a mensagem "Valores aceitos", senão escrever "Valores nao aceitos".
public class Ex1035 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valorA = scanner.nextInt();
        int valorB = scanner.nextInt();
        int valorC = scanner.nextInt();
        int valorD = scanner.nextInt();

        int somaCD = valorC + valorD;
        int somaAB = valorA + valorB;
        int verificaAPar = (valorA % 2);


        if (valorB > valorC && valorD > valorA) {
            if (somaCD > somaAB) {
                if (valorC > 0 && valorD > 0) {
                    if (verificaAPar == 0) {
                        System.out.println("Valores aceitos");
                    }
                }
            }
        } else {
            System.out.println("Valores não aceitos");
        }
    }
}