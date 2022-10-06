package exercicio.uri.ambrosia_andrade.util;

public class TesteDeMesa_13Set2021_Ex2_1 {
    public static void main(String[] args){
        int m = 5;
        int[][] mat = new int[m][m];

        for(int i = 0; i < m; i++){
            mat[3][i] = 10;
        }

        for(int i = 0; i < m; i++){
            mat[i][4] = 10 * i;
            mat[i][i] = 50;
        }

        for (int i = 0; i < m; i++){
            for (int j = 0; j < m; j++){
                System.out.print( mat[i][j] + "\t\t");
            }
            System.out.println();
        }
    }
}
