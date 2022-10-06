package exercicio.uri.byanca_calixto.util;

public class EstruturaRepeticaoPara {

    //Para uma estrutura de repeticao FOR (para), eu devo saber quantas vezes vou repetir o comando do laco
    public static void main(String[] args) {
        //criar variavel      condicao        incremento/decremento
        for (int i = 0;        i <=5;                i++ ){
            System.out.println("Executando com For INCREMENTO++ => " + i);
        }
        System.out.println();
        System.out.println();

        for (int i = 5;        i > 0;                i-- ){
            System.out.println("Executando com For DECREMENTO-- => " + i);
        }
    }
}
