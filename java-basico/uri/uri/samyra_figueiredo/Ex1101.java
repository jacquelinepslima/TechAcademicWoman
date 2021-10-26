package exercicio.uri.samyra_figueiredo;

import java.util.Scanner;

public class Ex1101 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        while (x > 0 && y > 0){
            int soma = 0;
            if (x > y) {
                for (y = y; y <= x; y++) {
                    soma += y;
                    System.out.print(y + " ");
                }
                System.out.println("sum=" + soma);
                x = sc.nextInt();
                y = sc.nextInt();


            } else{
                for (x = x; x <= y; x++) {
                    soma += x;
                    System.out.print(x + " ");
                }
                System.out.println("sum=" + soma);
                x = sc.nextInt();
                y = sc.nextInt();


            }
        }
        sc.close();
    }
}
