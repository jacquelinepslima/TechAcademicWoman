package exercicio.uri.paula_santos;

import java.util.Scanner;

public class Ex1003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B= scanner.nextInt();

        int soma = A+B;

        System.out.printf("SOMA = %d",soma);

        scanner.close();
    }
}
