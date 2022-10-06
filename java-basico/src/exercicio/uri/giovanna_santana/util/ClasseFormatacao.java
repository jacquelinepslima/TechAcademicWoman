package exercicio.uri.giovanna_santana.util;

public class ClasseFormatacao {

    public static void main(String[] args) {

        String nome = "Alicio da Cunha";
        int idade = 9;
        double renda = 100.00;

        System.out.print("Dessa forma nao pupa linha");
        System.out.println("Pula uma linha");
        System.out.printf("%s, tenho %d anos e ganho R$ %.2f reais %n", nome, idade, renda);

    }
}
