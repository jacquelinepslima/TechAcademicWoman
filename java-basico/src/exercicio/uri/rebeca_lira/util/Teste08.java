package exercicio.uri.rebeca_lira.util;

public class Teste08 {
    public static void main(String[] args) {
        int m = 2;
        int n = 4;
        int x = 0;
        int[][] mat = new int[6][6];

        for (int i=0; i<m; i++){
            x = x+i;
            for (int j=0; j<n; j++){
                x = x+j;
                mat[i][j] = x;
                System.out.print(mat[i][j] + " ");
            } System.out.println();
        }

    }
}
