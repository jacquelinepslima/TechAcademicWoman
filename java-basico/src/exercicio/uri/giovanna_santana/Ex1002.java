package exercicio.uri.giovanna_santana;


import java.util.Locale;
import java.util.Scanner;

public class Ex1002 {
    public static void main(String[] args) {

        //mudando o padrao numerico geral para o internacional
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;

        System.out.println("Digita o valor do raio (duas casas decimais)");
        double raio = sc.nextDouble();

        double area = Math.PI * Math.pow(raio,2);

        System.out.printf("A= %.4f%n", area);

        sc.close();
    }
}
