package exercicio.uri.caroline_souza;

import java.util.Scanner;

public class Ex1145 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();

        for (int i = 1; i < Y; i++){
            System.out.printf("%d ", i);


            if (i % X == 0){
                System.out.println("");
            }

        }

        sc.close();
    }

}
