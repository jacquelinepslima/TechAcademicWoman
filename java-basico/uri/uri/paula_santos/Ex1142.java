package exercicio.uri.paula_santos;

import java.util.Scanner;

public class Ex1142 {

    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        for(int i = 1; i <= (N*4); i += 4) {
            System.out.printf("%d %d %d PUM %n", i, i + 1, i + 2);
        }

        scan.close();
    }
}
