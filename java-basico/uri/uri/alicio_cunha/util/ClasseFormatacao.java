package exercicio.uri.alicio_cunha.util;

import java.util.Locale;

public class ClasseFormatacao {

    public static void main(String[] args) {

        // Locale.setDefault(Locale.US);
        String nome = "Alicio da Cunha";
        int idade = 9; // idade mental
        double renda = 100.00;

        System.out.print("Informacoes da pessoa");
        System.out.println(nome + ", tenho " + idade + " anos e ganho R$" + renda + " reais");
        System.out.println();
        System.out.printf("%s, tenho %d anos e ganho R$ %.2f reais %n", nome, idade, renda);

        System.out.printf("Oi, meu nome é %s, tenho %d anos, não sou obrigado a nada e ganho milhões mas não conto pra ninguém !"
                , nome, idade);
        System.out.println("A frase foi da Jacque");

    }

}
