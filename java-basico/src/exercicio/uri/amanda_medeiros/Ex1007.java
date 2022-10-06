package exercicio.uri.amanda_medeiros;

import java.util.Scanner;

public class Ex1007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int primeiro = scanner.nextInt();
        int segundo = scanner.nextInt();
        int terceiro = scanner.nextInt();
        int quarto = scanner.nextInt();

        int diferenca = primeiro * segundo - terceiro * quarto;

        System.out.println("DIFERENCA = " + diferenca);

        scanner.close();
    }
}
