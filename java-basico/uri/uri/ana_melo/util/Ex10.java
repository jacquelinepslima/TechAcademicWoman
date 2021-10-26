package exercicio.uri.ana_melo.util;

public class Ex10 {
    public static void main(String[] args) {
        int n = 3;
        int x;
        int[] v = new int[n];

        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++){
            x = 0;
            for (int j = 0; j < n; j++){
                matriz[i][j] = i+j;
                x = x + matriz[i][j];
            }
            v[i] = x;
        }

        for (int i = 0; i < n; i++){
            for(int j=0; j< n; j++ ){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        for(int i = 0; i < n; i++){
            System.out.println(v[i]);
        }
    }
}
