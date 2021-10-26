package exercicio.uri.palloma_soares.util;

public class Arranjo {
    public static void main(String[] args) {
        /* Vector --> vetor
                 * Indexado
                 * unidimensional
                 * homogeneo
                 * tamanho fixo
        */
        //declaração ou Instancio o vetor
        int[] vetor = new int[5];
        //populo = a estrutura
        vetor[0] = 34;
        vetor[1] = 66;
        vetor[2] = 65224;
        vetor[3] = 898;
        vetor[4] = 1;

        System.out.println(vetor[0]);
        System.out.println(vetor[1]);
        System.out.println(vetor[2]);
        System.out.println(vetor[3]);
        System.out.println(vetor[4]);
        System.out.println();
        System.out.println();

        String[] nomes = new String[4];

        nomes[0] = "Luana";
        nomes[1] = "Samyra";
        nomes[2] = "Ana Melo";
        nomes[3] = "234252";

        System.out.println(nomes[0]);
        System.out.println(nomes[1]);
        System.out.println(nomes[2]);
        System.out.println(nomes[3]);
        System.out.println();
        System.out.println();

        double[] valor = new double[4];

        valor[0] = 3.0;
        valor[1] = 0.0;
        valor[2] = 948.99;
        valor[3] = 6754.04;

        System.out.println(valor[0]);
        System.out.println(valor[1]);
        System.out.println(valor[2]);
        System.out.println(valor[3]);
    }
}
