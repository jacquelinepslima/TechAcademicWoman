package exercicio.uri.maressa_oliveira.util;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;

public class ClasseFormatacao {
    public static void main(String[] args) {

        String nome = "Alício da Cunha";
        int idade = 9; //idade mental
        double renda = 100.00;

        System.out.println(nome+ ", tenho "+idade+" anos e ganho R$"+renda+" reais");
        System.out.println();
        System.out.printf("%s, tenho %d anos e ganho R$ %.2f reais%n",nome,idade,renda);
        System.out.println();
        System.out.printf("Oi, meu nome é %s, tenho %d anos, não sou obrigado a nada e ganho milhões, mas não conto para ninguém! ",nome,idade);
        System.out.printf("A frase foi da Jacque.");
    }
}