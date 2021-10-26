package exercicio.uri.jacque_lima.util;

public class EstruturaRepeticaoPara {

    //Para a estrutura de repeticao FOR(para) eu sei quantas vezes eu vou repetir esse codigo de laco
    public static void main(String[] args) {
        //criar variavel; condicao; incremento ou decremento
        for(int i = 0; i < 5; i++){
            System.out.println("Executando com o FOR INCREMENTO ++ => " + i);
        }

        System.out.println();
        System.out.println();

        for(int i = 5; i > 0; i--){
            System.out.println("Executando com o FOR DECREMENTO -- => " + i);
        }

    }
}
