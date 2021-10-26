package exercicio.uri.ambrosia_andrade.util;

public class TesteDeMesa_13Set2021_Ex3_1 {
    public static void main(String[] args){
        int m = 5;
        float[] v = new float[m];
        float[][] mat = new float[m][m];

        // Populando o vetor
        for(int i = 0; i < m; i++){
            v[i] = 10 - i;
        }

        // Populando a matriz
        for(int i = 0; i < m; i++){
            mat[i][i] = v[i] / 10;
        }

        System.out.println("Matriz:\n");

        for (int i = 0; i < m; i++){
            for (int j = 0; j < m; j++){
                System.out.print( mat[i][j] + "\t\t");
            }
            System.out.println();
        }

        System.out.println("\nVetor:\n");

        for (int i = 0; i< m; i++){
            System.out.print(v[i] + "\t\t");
        }
    }
}
