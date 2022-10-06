package exercicio.uri.paula_santos;

import java.util.Scanner;

public class Ex1144 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        for(int i = 1; i <= N; i++) {
            System.out.printf("%d %d %d %n", i, i * i, i * i * i);
            System.out.printf("%d %d %d %n", i, (i * i)+1, (i * i * i)+1);
        }

        scan.close();
    }
}
