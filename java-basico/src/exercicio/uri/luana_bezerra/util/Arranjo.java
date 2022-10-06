package exercicio.uri.luana_bezerra.util;

public class Arranjo {

    public static void main(String[] args) {
        /* Vector --> vetor
                * Indexado
                * Unidimensional
                * homogeneo
                * tamanho fixo
        */
        // declaração ou INSTACIO O VETOR
        int[] vetor = new int[5];
        // populo a estrutura
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

        String[] nomes = new String[4];

        nomes[0] = "Luana";
        nomes[1] = "Samyra";
        nomes[2] = "Ana Melo";
        nomes[3] = "22222222";

        System.out.println(nomes[3]);

    }
}
