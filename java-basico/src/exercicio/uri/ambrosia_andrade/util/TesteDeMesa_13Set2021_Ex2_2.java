package exercicio.uri.ambrosia_andrade.util;

public class TesteDeMesa_13Set2021_Ex2_2 {
    public static void main(String[] args){
        int n = 3, x;
        int[] v = new int[n];
        int[][] mat = new int[n][n];

        for(int i = 0; i < n; i++){
            x = 0;
            for (int j = 0; j < n; j++){
                mat[i][j] = i + j;
                x = x + mat[i][j];
            }
            v[i] = x;
        }

        System.out.println("Matriz:\n");

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print( mat[i][j] + "\t\t");
            }
            System.out.println();
        }

        System.out.println("\nVetor:\n");

        for (int i = 0; i< n; i++){
            System.out.print(v[i] + "\t\t");
        }
    }
}
