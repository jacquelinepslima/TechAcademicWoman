package exercicio.uri.evelin_ferraz;

import java.util.Scanner;

public class Ex1004 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um valor inteiro: ");
        int num1 = sc.nextInt();

        System.out.println("Insira outro valor inteiro: ");
        int num2 = sc.nextInt();

        int PROD = num1 * num2;

        System.out.printf("PROD= %d", PROD);

        sc.close();
    }
}
