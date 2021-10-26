package exercicio.uri.ana_melo.util;

public class Ex11 {
    public static void main(String[] args) {
        int m = 5;
        double[] v = new double[m];

        double[][] matriz = new double[m][m];

        for(int i = 0; i < m; i++){
            v[i] = 10 - i;
        }
        for(int i = 0; i < m; i++){
            matriz[i][i] = v[i]/10;
        }

        for (int i = 0; i < m; i++){
            for(int j=0; j< m; j++ ){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        for(int i = 0; i < m; i++){
            System.out.println(v[i]);
        }
    }
}
