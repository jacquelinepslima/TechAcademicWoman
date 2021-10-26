package exercicio.uri.rebeca_lira.util;

public class Teste11 {
    public static void main(String[] args) {
        int m = 5;
        int[][] mat = new int[6][6];
        int[] v = new int[6];

        for (int i = 0; i < m; i++) {
            v[i] = 10 - i;
            System.out.print(v[i] + " ");
        }

        System.out.println();

        for (int i=0; i<m; i++){
            mat[i][i] = v[i] / 10;
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();
    }
}
