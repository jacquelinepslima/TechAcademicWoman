package exercicio.uri.alline_cardoso;

import java.util.Scanner;

public class Ex1072 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int i = 0;
        int o = 0;

        while (N > 0) {
            int valor = scan.nextInt();
            if ((valor >= 10) && (valor <= 20)) {
                i++;

            } else {
                o++;
            }
            N--;
        }

        System.out.println(i + "in");
        System.out.println(o + "out");

        scan.close();
    }
}
