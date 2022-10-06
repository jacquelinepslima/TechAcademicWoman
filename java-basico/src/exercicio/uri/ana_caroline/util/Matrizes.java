package exercicio.uri.ana_caroline.util;

public class Matrizes {

    /*
       indexada
       bidimensional
       homogenea
       tamanho de alocacao fixo

     */

    public static void main(String[] args) {
        int[][] matriz = new int[2][2];

        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[1][0] = 5;
        matriz[1][1] = 6;

        System.out.println(matriz[0][0]);
        System.out.println(matriz[0][1]);
        System.out.println(matriz[1][0]);
        System.out.println(matriz[1][1]);
    }


}
