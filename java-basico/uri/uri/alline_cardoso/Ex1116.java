package exercicio.uri.alline_cardoso;

import java.util.Locale;
import java.util.Scanner;

public class Ex1116 {
    public static void main(String[] args) {
        System.out.println("Quantidade de Pares");
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int a = 1; a <= N; a++) {
            System.out.println("Dois numeros");
            int X = scanner.nextInt();
            int Y = scanner.nextInt();
            if (Y == 0) {
                System.out.println("divisão impossível");
            }
            else if (X / Y <= 0) {
                double resultado = (double) X / Y;
                System.out.printf("%.1f%n", resultado);
            }
        }
        scanner.close();
    }
}

