package exercicio.uri.ambrosia_andrade.util;

public class ClasseFormatacao {
    public static void main(String[] args){
        String nome = "Ambrósia Andrade";
        int idade = 9; // idade mental
        double renda = 100.00;

        System.out.println(nome + ", tem " + idade + " anos e ganha " + renda + " reais");
        System.out.printf("%s, tem %d anos e ganha %.2f reais", nome, idade, renda);
    }
}
