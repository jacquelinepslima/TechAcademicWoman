package exercicio.uri.rebeca_lira.util;

public class Teste07 {
    public static void main(String[] args) {
        int n = 3;
        int[][] mat = new int[6][6];

        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                mat[i][j] = 1+i+j;
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

    }
}
