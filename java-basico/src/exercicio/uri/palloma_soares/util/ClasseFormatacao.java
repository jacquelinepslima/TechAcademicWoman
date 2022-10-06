package exercicio.uri.palloma_soares.util;

public class ClasseFormatacao {

    public static void main(String[] args) {
        String nome = "Palloma Ruysa";
        int idade = 18;
        double renda = 10000.00;

        System.out.println(nome+", tenho "+idade+" anos e ganho R$ "+renda+" por mês");
        System.out.printf("%s, tenho %d anos e ganho R$ %.2f por mês%n", nome, idade, renda);
    }
}
