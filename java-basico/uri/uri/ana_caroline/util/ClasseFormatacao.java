package exercicio.uri.ana_caroline.util;

public class ClasseFormatacao {

    public static void main(String[] args) {

        String nome = "Ana Caroline";
        int idade = 19;
        double renda = 100.00;

        System.out.println(nome + ", tenho " + idade + " anos e ganho R$" + renda);
        System.out.printf("%s, tenho %d anos e ganho R$%.2f%n", nome, idade, renda);
    }
}
