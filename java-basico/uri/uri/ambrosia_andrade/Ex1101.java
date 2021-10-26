package exercicio.uri.ambrosia_andrade;

import java.util.Scanner;

public class Ex1101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m, n, sum=0;

        n = sc.nextInt();
        m = sc.nextInt();

        if (m > n){
            for (int i = n; i <= m; i++){
                sum += i;
                System.out.print(i + " ");
            }
            System.out.print("Sum=" + sum);
        } else {
            for (int i = m; i <= n; i++){
                sum += i;
                System.out.print(i + " ");
            }
            System.out.print("Sum=" + sum);
        }

        sc.close();
    }
}
