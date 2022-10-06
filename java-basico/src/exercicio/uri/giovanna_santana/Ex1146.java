package exercicio.uri.giovanna_santana;

import java.util.Scanner;

public class Ex1146 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = 1;

        while (X != 0){
            X = sc.nextInt();
            for (int i = 1; i <= X; i++){
                System.out.println(i + " ");

            }
        }
        sc.close();
    }
}
