package exercicio.uri.ambrosia_andrade.util;

public class TesteDeMesa_13Set2021_Ex3_2 {
    public static void main(String[] args){
        int n = 4;
        int[][] mat = new int[n][n];

        // Populando a matriz
        for(int i = 0; i < n; i++){
             for(int j = 0; j < i; j++){
                 mat[i][j] = (i + 1) * 10;
             }
        }

        System.out.println("Matriz:\n");

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print( mat[i][j] + "\t\t");
            }
            System.out.println();
        }

    }
}
