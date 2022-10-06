package exercicio.revisao;

import java.util.Scanner;

public class Matriz_07_revisao_27_09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt(); // m - linhas
        int y = scanner.nextInt(); // n - colunas

        int[][] pelotao = new int[x][y];

        // entrando com as valores do pelotao
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                pelotao[i][j] = scanner.nextInt();
            }
        }

        // Apresentacao dos valores do pelotao
        System.out.println("Pelotão: ");
        for (int i = 0; i < x; i++) {// linha
            for (int j = 0; j < y; j++) {// coluna
                System.out.print(pelotao[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Qual linha do pelotão e para girar? ");
        // fazer aqui o processamento do gira fila
        int linhaGiraFila = scanner.nextInt();

        // como o exercicio diz que é iniciado em 1, e matriz começa em 0
        // precisamos pegar a linha -1
        linhaGiraFila -= 1;

        // ultimo valor de uma linha
        int ultimoSoldadoFila = pelotao[linhaGiraFila][y-1]; // 7201

        // move todos os elementos para a direita
        for (int j = y - 1; j >0; j--){
            pelotao[linhaGiraFila][j] = pelotao[linhaGiraFila][j-1];
        }

        pelotao[linhaGiraFila][0] = ultimoSoldadoFila;


        System.out.println("Girar  ");
        System.out.println("Pelotão: Girado");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(pelotao[i][j] + " ");
            }
            System.out.println();
        }


        scanner.close();
    }
}
