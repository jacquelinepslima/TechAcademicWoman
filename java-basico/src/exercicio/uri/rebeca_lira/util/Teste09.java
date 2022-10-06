package exercicio.uri.rebeca_lira.util;

public class Teste09 {
    public static void main(String[] args) {

        int m = 5;
        int[][] mat = new int[6][6];

        for (int i=0; i<m; i++){
            mat[3][i] = 10;
            System.out.print(mat[3][i] + " ");
        }

        System.out.println();

        for (int i=0; i<m; i++){
            mat[i][4] = 10*i;
            mat[i][i] = 50;
            System.out.println(mat[i][4] + " ");
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();
    }
}
