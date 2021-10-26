package exercicio.uri.alline_cardoso;

import java.util.Scanner;

public class Ex1067 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();

        for (int Y = 1; Y <= X; Y = Y + 2) {
            System.out.println(Y);
        }
        scanner.close();
    }
}
