package exercicio.uri.rebeca_lira.util;

public class Arranjo {
    public static void main(String[] args) {
        /* Vector --> vetor
            Características:
            * indexado
            * unidimensional
            * homogêneo
            * tamanho fixo
         */

        // Declaração ou instanciação do vetor
        int[] vetor = new int[5];

        // População do vetor
        vetor[0] = 8;
        vetor[1] = 32;
        vetor[2] = 44;
        vetor[3] = 76;
        vetor[4] = 1;

        System.out.println(vetor[0]);
        System.out.println(vetor[1]);
        System.out.println(vetor[2]);
        System.out.println(vetor[3]);
        System.out.println(vetor[4]);

        String[] nomes = new String[3];

        nomes[0] = "Luana";
        nomes[1] = "Samyra";
        nomes[2] = "Ana Melo";

        System.out.println();
        System.out.println(nomes[0]);
        System.out.println(nomes[1]);
        System.out.println(nomes[2]);

    }
}
