package exercicio.uri.paula_santos.util;

public class ClasseFormatacao {
    public static void main(String[] args) {
        String nome = "Paula Santos";
        int idade = 38;
        double renda = 100.000;

        System.out.println("Meu nome é "+ nome + ", tenho " + idade + " anos e ganho R$ " + renda);
        System.out.println();
        System.out.printf("Meu nome é %s, tenho %d anos e ganho R$ %.2f reais %n", nome, idade, renda);
    }
}
