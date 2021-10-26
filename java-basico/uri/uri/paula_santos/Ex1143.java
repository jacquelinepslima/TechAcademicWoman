package exercicio.uri.paula_santos;

import java.util.Scanner;

public class Ex1143 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        for(int i = 1; i <= N; i++) {
            System.out.printf("%d %d %d %n", i, i * i, i * i * i);
        }

        scan.close();

    }
}
