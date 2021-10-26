package exercicio.uri.ana_cruz;

import java.util.Scanner;

public class Ex1074 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        for (int i = 0; i < N; i++) {
            int numero = scan.nextInt();
            if (numero == 0) {
                System.out.println("NULL");
            } else {
                if (numero % 2 == 0) {
                    System.out.print("EVEN ");
                } else {
                    System.out.printf("ODD ");
                }
                if (numero > 0) {
                    System.out.println("POSITIVE");
                } else {
                    System.out.println("NEGATIVE");
                }
            }

        }
        scan.close();
    }
}
