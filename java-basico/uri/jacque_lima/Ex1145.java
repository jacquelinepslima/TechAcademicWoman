package exercicio.uri.jacque_lima;

import java.util.Scanner;

public class Ex1145 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        for(int i = 1; i <= y; i += 3){
            for(int j = i; j <= i + (x - 1); j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
