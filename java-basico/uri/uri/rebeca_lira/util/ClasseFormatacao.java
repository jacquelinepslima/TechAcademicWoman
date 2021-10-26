package exercicio.uri.rebeca_lira.util;

public class ClasseFormatacao {
    public static void main(String[] args) {

        String nome = "Rebeca Lira";
        int idade = 24;
        double  renda = 2500;

        System.out.println("Meu nome é " + nome + ", tenho " + idade + " anos e ganho R$" + renda + " reais por mês.");
        System.out.println();
        System.out.printf("Meu nome é %s, tenho %d anos e ganho R$ %.2f reais por mês. %n", nome, idade, renda);

    }

}
