package exercicio.uri.amanda_medeiros;

import java.util.Scanner;

public class Ex1013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valorA = scanner.nextInt();
        int valorB = scanner.nextInt();
        int valorC = scanner.nextInt();

        int maiorAB = (valorA + valorB + (Math.abs(valorA - valorB)))/2;
        int maiorFinal = (maiorAB + valorC + (Math.abs(maiorAB - valorC)))/2;

        System.out.println(maiorFinal + " eh o maior");

        scanner.close();
    }
}
