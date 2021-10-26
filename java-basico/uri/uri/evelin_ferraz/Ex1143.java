package exercicio.uri.evelin_ferraz;

import java.util.Scanner;

public class Ex1143 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, quadrado, cubo;
        n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            quadrado = i * i;
            cubo = quadrado * i;
            System.out.println(i + " " + quadrado + " " + cubo);
        }

        sc.close();
    }
}
