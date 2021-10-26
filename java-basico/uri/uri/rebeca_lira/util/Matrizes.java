package exercicio.uri.rebeca_lira.util;

public class Matrizes {
    public static void main(String[] args) {
        /*
            Especificações das matrizes:
            * São indexadas
            * Bidimensionais (tem linhas e colunas)
            * Homogêneas (só recebem um tipo de valor)
            * Tamanho de alocação fixa
         */

        // declaração de matriz - arranjo bidimensional
        int[][] matriz = new int[2][2];

        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[1][0] = 5;
        matriz[1][1] = 6;

        System.out.println(matriz[0][0]);
        System.out.println(matriz[0][1]);
        System.out.println(matriz[1][0]);
        System.out.println(matriz[1][1]);

    }
}
