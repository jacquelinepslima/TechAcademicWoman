package exercicio.uri.caroline_souza;

import java.util.Scanner;

public class Ex1074 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X;

        for (int i = 0; i < N;  i++){
            X = sc.nextInt();
            if (X == 0){
                System.out.print("NULL ");
            } else if (X % 2 != 0) {
                System.out.print("ODD ");
            } else {
                System.out.print("EVEN ");
            }

            if (X < 0){
                System.out.println("NEGATIVE ");
            } if (X > 0 ){
                System.out.println("POSITIVE ");
            }

        }

        sc.close();
    }
}
