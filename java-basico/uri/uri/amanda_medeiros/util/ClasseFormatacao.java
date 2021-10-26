package exercicio.uri.amanda_medeiros.util;

public class ClasseFormatacao {
    public static void main(String[] args) {
        String nome = "Alice Souza";
        int idade = 9;
        double renda = 100.00;
        System.out.println(nome + ", tenho "+idade+" anos e ganho R$"+renda + "reais");
        System.out.printf("%s, tenho %d anos e ganho R$ %.2f reais%n", nome, idade, renda);
    }
}
