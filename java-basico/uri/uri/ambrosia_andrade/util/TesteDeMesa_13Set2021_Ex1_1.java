package exercicio.uri.ambrosia_andrade.util;

public class TesteDeMesa_13Set2021_Ex1_1 {
    public static void main(String[] args) {
        int n = 3;
        int[][] mat = new int[n][n];

        // Populando a matriz
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                mat[i][j] = 1 + i + j;
            }
        }

        // Imprimindo a matriz
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
