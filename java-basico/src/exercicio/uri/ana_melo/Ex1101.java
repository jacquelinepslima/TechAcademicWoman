package exercicio.uri.ana_melo;

import java.util.Scanner;

public class Ex1101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m,n,soma = 0;
        m = sc.nextInt();
        n = sc.nextInt();

        while (m > 0 && n > 0){

            if (m < n){
                for (int i = m; i <= n; i++){
                    System.out.print(i + " ");
                    soma += i;
                }
                System.out.println("Sum=" + soma);
                soma = 0;
            } else {
                for (int i = n; i <= m; i++){
                    System.out.print(i + " ");
                    soma += i;
                }
                System.out.println("Sum="+soma);
                soma = 0;
            }
            m = sc.nextInt();
            n = sc.nextInt();
        }


        sc.close();
    }
}
