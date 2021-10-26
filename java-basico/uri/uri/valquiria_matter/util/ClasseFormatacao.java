package exercicio.uri.valquiria_matter.util;

public class ClasseFormatacao {

    public static void main(String[] args) {
        String nome = "Valquiria";
        int idade = 9;
        double renda = 100.00;

        System.out.println(nome  + ", tenho " + idade + " anos" + " ganho R$: " + renda + " reais");
        System.out.printf("%s, tenho %d anos ganho R$: %2f reais %n", nome, idade, renda);

    }




}
