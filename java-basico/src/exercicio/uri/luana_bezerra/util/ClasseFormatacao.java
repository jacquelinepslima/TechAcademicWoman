package exercicio.uri.luana_bezerra.util;

public class ClasseFormatacao {

    public static void main(String[] args) {

        String nome = "Luana Bezerra";
        int idade = 27;
        double renda = 10000.00;

        System.out.println(nome + ", tenho " + idade + " anos e ganho " + renda + " reais.");
        System.out.printf("%s, tenho %d anos e ganho %.2f reais%n", nome, idade, renda);

    }
}
