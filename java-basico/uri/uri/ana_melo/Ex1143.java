package exercicio.uri.ana_melo;

import java.util.Scanner;

public class Ex1143 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            System.out.print(i + " ");
            System.out.print(i*i + " ");
            System.out.println(i*i*i);
        }

        sc.close();
    }
}
