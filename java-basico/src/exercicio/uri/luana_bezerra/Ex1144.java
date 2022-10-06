package exercicio.uri.luana_bezerra;

import java.util.Scanner;

public class Ex1144 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        for (int i = 1; i <= n; i++){

            int j = i * i;
            int k = i * i * i;
            System.out.println(i + " " + j + " " + k);

            int l = j +1;
            int m = k+1;

            System.out.println(i + " " + l + " " + m);

        }

        sc.close();
    }
}
