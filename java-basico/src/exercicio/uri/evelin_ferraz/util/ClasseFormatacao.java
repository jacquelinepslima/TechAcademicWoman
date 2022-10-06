package exercicio.uri.evelin_ferraz.util;
import java.util.Locale;

public class ClasseFormatacao {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        String nome = "Evelin Ferraz";
        int idade = 24;
        double renda = 100.00;

        System.out.println(nome+ ", tenho "+ idade + " anos e ganho R$" + renda);

        // %s = string, %d = digito inteiro, %.2f = duas casas decimais, %n = pula uma linha;
        System.out.printf("%s, tenho %d anos e ganho R$ %.2f %n", nome, idade, renda);
    }
}
