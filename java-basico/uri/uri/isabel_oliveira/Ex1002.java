package exercicio.uri.isabel_oliveira;

import java.util.Locale;
import java.util.Scanner;

public class Ex1002 {
    public static void main(String[] args) {
        //mudando a padronização dos sistema numérico para o internacional
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do raio com duas casas decimais");
        double raio = sc.nextDouble();

        double area = 3.14159 * Math.pow(raio,2);

        System.out.printf("A=%.4f%n", area);
        sc.close();
    }
}
