package exercicio.uri.amanda_medeiros.util;

public class Arranjo {
    public static void main(String[] args) {
        /* Vector --> vetor
         * Indexado
         * Unidimensional
         * Homogêneo
         * Tamanho Fixo
         * */
        // Instanciando vetor
        int[] vetor = new int[5];

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

        System.out.println();
        System.out.println();

        String[] nomes = new String[3];

        nomes[0] = "oiiie";
        nomes[1] = "boa";
        nomes[2] = "tarde!";

        System.out.println(nomes[0]);
        System.out.println(nomes[1] + " " + nomes[2]);
    }
}
