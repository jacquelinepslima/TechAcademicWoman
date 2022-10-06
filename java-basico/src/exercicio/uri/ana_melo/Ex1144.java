package exercicio.uri.ana_melo;

import java.util.Scanner;

public class Ex1144 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n = entrada.nextInt();

        for(int i = 1; i <= n; i++) {
            System.out.printf(i + " " + (i*i) + " " + (i*i*i) + "%n");
            System.out.printf(i + " " + ((i*i) + 1) + " " + ((i*i*i) + 1) + "%n");
        }
    }
}
