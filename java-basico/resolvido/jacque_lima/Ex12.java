package exercicio.resolvido.jacque_lima;

import java.util.Scanner;

public class Ex12 {

    /*
    criar uma matriz quadrada;
    apresentar os valores da diagonal princiapal;
    apresentar os numero de elementos negativos da matriz
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int[][] matriz = new int[x][x];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Elementos da diagonal principal:");
        for (int i = 0; i < x; i++) {
            System.out.print(matriz[i][i] + " ");
        }

        int qtdNumerosNegativos = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {

                if (matriz[i][j] < 0) {
                    qtdNumerosNegativos++;
                    //qtdNumerosNegativos = qtdNumerosNegativos + 1;
                }
            }
        }

            System.out.println();

            System.out.printf("Diagonal Principal ");
            System.out.printf("Nº de elementos negativos: ");

            System.out.printf("Quantidade de numeros negativos %d %n", qtdNumerosNegativos);


            sc.close();
        }
    }

