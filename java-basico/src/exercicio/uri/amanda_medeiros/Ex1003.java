package exercicio.uri.amanda_medeiros;

import java.util.Scanner;

public class Ex1003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int primeiroValor = scanner.nextInt();
        int segundoValor = scanner.nextInt();

        int resultado = primeiroValor + segundoValor;

        System.out.println("SOMA = " + resultado);


        scanner.close();

    }
}
