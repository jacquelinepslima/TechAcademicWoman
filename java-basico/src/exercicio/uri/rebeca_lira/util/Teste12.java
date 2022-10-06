package exercicio.uri.rebeca_lira.util;

public class Teste12 {
    public static void main(String[] args) {

        int n = 4;
        int[][] mat = new int[6][6];

        for(int i=0; i<n; i++){
            for(int j = 0; j<i; j++){
                mat[i][j] = (i+1) * 10;
                System.out.print(mat[i][j] + " ");
            }
        }
    }
}
