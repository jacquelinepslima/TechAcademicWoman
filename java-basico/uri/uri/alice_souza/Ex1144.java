package exercicio.uri.alice_souza;

import java.util.Scanner;

public class Ex1144 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int A, B= 0, C= 0;
        for(int i =0 ; i<N ; i++){
                A = i +1;
                B = (int) Math.pow(A, 2);
                C = (int) Math.pow(A, 3);
                System.out.println(A+" "+B+" "+C);
                System.out.println(A+" "+(B+1)+" "+(C+1));
            }
        scan.close();
    }
}
