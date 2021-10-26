package exercicio.uri.giovanna_santana.util;

public class Arranjo {
    public static void main(String[] args) {
        /*  Vector -- >
                * indexado
                * unidimensional
                * homogeneo
                * tamanho fixo
         */

        //declaro ou INSTANCIO O VETOR
        int [] vetor = new int[5];
        // populo a estrutura
        vetor [0] = 8;
        vetor [1] = 32;
        vetor [2] = 44;
        vetor [3] = 76;
        vetor [4] = 1;

        System.out.println(vetor[0]);
        System.out.println(vetor[1]);
        System.out.println(vetor[2]);
        System.out.println(vetor[3]);
        System.out.println(vetor[4]);
        System.out.println();
        System.out.println();

        String[] nomes = new String[5];

        nomes[0] = "Luana";
        nomes[1] = "Samyra";
        nomes[2] = "Ana Melo";
        nomes[3] = "zzzzz";

        System.out.println(nomes[3]);

    }
}
