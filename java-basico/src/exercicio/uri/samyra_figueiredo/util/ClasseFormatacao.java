package exercicios.uri.samyra_figueiredo.util;

import java.util.Locale;

public class ClasseFormatacao {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        String nome = "Samyra França";
        int idade = 18;
        double renda = 2500.00;

        System.out.println("Me chamo " + nome + ", tenho " + idade + " anos e ganho R$ " + renda + " reais");
        System.out.println();
        System.out.printf("Me chamo %s, tenho %d anos e ganho R$ %.2f reais \n", nome, idade, renda);

    }
}
