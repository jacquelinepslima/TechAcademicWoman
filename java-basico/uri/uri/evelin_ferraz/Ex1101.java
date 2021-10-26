package exercicio.uri.evelin_ferraz;

import java.util.Scanner;

public class Ex1101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m, n, sum=0;

        n = sc.nextInt();
        m = sc.nextInt();

        while( m != 0 && n != 0){
            if (m > n){
                for (int i = n; i <= m; i++){
                    sum += i;
                    System.out.print(i + " ");
                }
                System.out.println("Sum=" + sum);
                n = sc.nextInt();
                m = sc.nextInt();
            } else {
                for (int i = m; i <= n; i++){
                    sum += i;
                    System.out.print(i + " ");
                }
                System.out.println("Sum=" + sum);
                n = sc.nextInt();
                m = sc.nextInt();
            }
        }
        sc.close();
    }
}
