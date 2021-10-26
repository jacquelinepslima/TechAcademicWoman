package exercicio.uri.ambrosia_andrade.util;

public class TesteDeMesa_13Set2021_Ex1_2 {
    public static void main(String[] args) {
        int m = 2, n = 4, x = 0;
        int[][] mat = new int[m][n];

        // Populando a matriz
        for (int i = 0; i < m; i++){
            x = x + i;
            for (int j = 0; j < n; j++){
                x = x + j;
                mat[i][j] = x;
            }
        }

        // Imprimindo a matriz
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
