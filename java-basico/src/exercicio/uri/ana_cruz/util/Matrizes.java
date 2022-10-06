package exercicio.uri.ana_cruz.util;

public class Matrizes {
    public static void main(String[] args) {
        /*
         * Indexado
         * Bidimensional
         * Homogêneo
         * Tamanho Fixo
         * */

        //Arranjo bidimencional = matriz
        int[][] matriz = new int[2][2];

        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[1][0] = 5;
        matriz[1][1] = 6;

        System.out.println(matriz[0][0] + " " + matriz[0][1]);
        System.out.println(matriz[1][0] + " " + matriz[1][1]);

        System.out.println();
        System.out.println();

    }
}
