package exercicio.uri.alice_souza;

import java.util.Scanner;

public class Ex1145 {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int X = scan.nextInt();
            int Y = scan.nextInt();

            for(int j = 1; j <= Y; j++) {
                System.out.print(j + " ");
                if(j%X==0)
                    System.out.println();
            }
            scan.close();
    }
}
