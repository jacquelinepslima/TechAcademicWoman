package exercicio.uri.ana_melo.util;

public class Ex12 {
    public static void main(String[] args) {
        int n = 4;
        int[][] matriz = new int[n][n];
        for(int i = 0; i < n; i++){
            for (int j = 0; j < i; j++){
                matriz[i][j] = (i + 1) * 10;
            }
        }

        for (int i = 0; i < n; i++){
            for(int j=0; j< n; j++ ){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
