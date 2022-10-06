package exercicio.uri.alice_souza;

import java.util.Scanner;

public class Ex1146 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int X=1;
        while(X != 0){
            X= scan.nextInt();
            for (int i=1; i<=X ; i++){
                System.out.print(i +" ");
            }
            System.out.println();
        }
        scan.close();
    }
}
