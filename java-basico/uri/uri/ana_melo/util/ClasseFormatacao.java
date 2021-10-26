package exercicio.uri.ana_melo.util;

public class ClasseFormatacao {

    public static void main(String[] args) {

        String nome = "Ana Luisa";
        int idade = 28;
        double renda = 10000.00;

        System.out.println(nome + ", tenho " + idade + " anos e ganho R$" + renda + " reais");
        System.out.println();
        System.out.printf("%s, tenho %d anos e ganho R$%.2f reais%n",nome,idade,renda);

    }
}
