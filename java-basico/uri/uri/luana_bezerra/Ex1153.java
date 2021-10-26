package exercicio.uri.luana_bezerra;

import java.util.Scanner;

public class Ex1153 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int fatorial = 1;

            for (int i = 2; i <= n; i++){

                fatorial *= i;

            }

            System.out.println(fatorial);
            sc.close();
        }

}
