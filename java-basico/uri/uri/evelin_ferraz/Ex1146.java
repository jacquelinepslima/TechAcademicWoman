package exercicio.uri.evelin_ferraz;

import java.util.Scanner;

public class Ex1146 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int X;

        X = scanner.nextInt();

        while( X != 0 ){
            for (int i = 1; i <= X; i++){
                System.out.print(i);
                if (i != X) System.out.print(" ");
            }
            X = scanner.nextInt();
        }

        scanner.close();
    }
}
