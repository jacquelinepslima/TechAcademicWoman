package exercicio.uri.alice_souza.util;

public class Matrizes {
    public static void main(String[] args) {
        /*
        Ser indexada
        bidimensional
        homogeneas
        tamanho de alocação fixa
         */
        //arranjo bidimensional = matriz

        int[][] matriz = new int [2][2];
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[1][0] = 3;
        matriz[1][1] = 4;

        System.out.println(matriz[0][0]);
        System.out.println(matriz[0][1]);
        System.out.println(matriz[1][0]);
        System.out.println(matriz[1][1]);
    }
}
