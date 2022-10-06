package exercicio.uri.alline_cardoso.util;

public class ClasseFormatacao {
    public static void main(String[] args) {

        String nome = "Alline Cardoso";
        int idade = 20;
        double renda = 123.45;

        //System.out.println("Informações");

        //System.out.println("Sou " + nome + ", tenho "+idade + " anos e ganho R$" + renda + " reais.");
        System.out.printf("Sou %s, tenho %d anos e ganho R$%.2f reais.%n", nome, idade, renda);



    }
}
