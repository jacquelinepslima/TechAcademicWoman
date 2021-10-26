package exercicio.uri.alice_souza;

import java.util.Scanner;

public class Ex1142 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.close();
        for (int i = 0; i<N; i++){
            System.out.println((1+i*4) +" " +(2+i*4) +" " +(3+i*4) +" PUM");
        }
    }
}
