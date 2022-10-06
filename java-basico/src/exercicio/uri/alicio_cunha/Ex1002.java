package exercicio.uri.alicio_cunha;

import java.util.Locale;
import java.util.Scanner;

public class Ex1002 {
    public static void main(String[] args) {

        // mudando a padronizacao do sistema numero para o internacional
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do raio (duas casa decimais)");
        double raio = sc.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);

        System.out.printf("A=%.4f%n",  area);

        //Presentation Error
        sc.close();
    }
}
