package exercicio.uri.jacque_lima;

import java.util.Locale;
import java.util.Scanner;

public class Ex1013 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        double maiorAB = (A + B + Math.abs(A - B)) / 2;
        double maiorABC = (maiorAB + C + Math.abs(maiorAB - C)) / 2;

        System.out.printf("%.0f eh o maior", maiorABC);

        scanner.close();
    }
}


