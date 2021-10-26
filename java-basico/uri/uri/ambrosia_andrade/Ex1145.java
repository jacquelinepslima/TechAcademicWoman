package exercicio.uri.ambrosia_andrade;

import java.util.Scanner;

public class Ex1145 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        for(int i = 1; i <= y; i++){

            System.out.print(i + " ");
            if(i % x ==0 ){
                System.out.println();
            }
        }

        sc.close();
    }
}
