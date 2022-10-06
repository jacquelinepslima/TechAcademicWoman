package exercicio.uri.byanca_calixto;

import java.util.Scanner;
import static java.lang.Math.abs;

public class Ex1013 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        double a = leitor.nextDouble();
        double b = leitor.nextDouble();
        double c = leitor.nextDouble();

        double maiorab = (a+b+abs(a-b))/2;
        double maiorTotal = (c+maiorab+abs(maiorab-c))/2;

        System.out.printf("%.1f eh o maior", maiorTotal);
        leitor.close();
    }

}
