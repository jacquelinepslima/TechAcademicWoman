package exercicio.uri.luana_bezerra.util;

public class EstruturaRepeticaoPara {

    //Para uma estrutura de repeticao FOR (para) EU SEI QUANTAS VEZES EU VOU REPETIR
    public static void main(String[] args) {
        // criar variavel: condicao     incrento ou decremento
        for (int i = 0; i < 5; i++) {
            System.out.println("Executando com o FOR INCREMENTO=>" + i);
        }
        System.out.println();
        System.out.println();
        for (int i = 5; i > 0; i--) {
            System.out.println("Executando com o FOR DECREMENTO - =>" + i);
        }
    }
}