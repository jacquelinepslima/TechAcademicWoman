package exercicio.uri.rebeca_lira.util;

public class Teste10 {
    public static void main(String[] args) {

        int n = 3;
        int[][] mat = new int[6][6];
        int[] v = new int[6];


        for (int i = 0; i < n; i++) {
            int x = 0;
            for (int j = 0; j < n; j++) {
                mat[i][j] = i + j;
                x = x + mat[i][j];
                System.out.print(mat[i][j] + " ");
            }
            v[i] = x;
            System.out.println();
            System.out.println("Vetor:");
            System.out.print(v[i] + " ");

        }
        System.out.println();

    }
}
