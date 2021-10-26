package exercicio.uri.ana_cruz.util;

public class ClasseFormatacao {

    public static void main(String[] args) {
        String nome = "Ana Cruz";
        int idade = 20;
        double renda = 167.89;

        System.out.println(nome + " tem " + idade + " anos e ganha R$ " + renda);
        System.out.printf("%s tem %d anos e ganha R$ %.2f%n", nome, idade, renda);
    }

}
