package exercicio.uri.rebeca_lira;

import java.util.Scanner;

public class Ex1153 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int resultado = num;

        for (int i = num; i > 1; i--) {
            resultado *= i - 1;
        }
        System.out.println(resultado);
    }
}
