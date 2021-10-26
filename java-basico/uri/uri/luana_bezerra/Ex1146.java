package exercicio.uri.luana_bezerra;

import java.util.Scanner;

public class Ex1146 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = 1;

        while (x !=0){

            x = sc.nextInt();

            for (int i = 0; i < x; i++){
                for (i = 2; i <= x; i++){
                    System.out.print((i - 1) + " ");
                }

            }
            System.out.println(x);
        }
        sc.close();
    }
}
