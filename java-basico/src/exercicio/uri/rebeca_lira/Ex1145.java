package exercicio.uri.rebeca_lira;

import java.util.Scanner;

public class Ex1145 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt();
        int Y = scanner.nextInt();

        if (X > 20) {
            System.out.println("Valor inválido.");
        } else if (Y > 100000 ^ Y < X) {
            System.out.println("Valor inválido.");
        } else {
            for (int y = 1; y <= Y; y++) {
                System.out.print(y);
                if (y % X == 0) {
                    System.out.println("");
                } else {
                    System.out.print(" ");
                }
            }


            scanner.close();

        }
    }
}
