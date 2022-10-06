package exercicio.uri.ana_cruz;

import java.util.Scanner;

public class Ex1143 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        for(int i = 1 ; i<=N ; i++)
            System.out.println( i + " " +(int)Math.pow(i,2) + " "+ (int)Math.pow(i,3));

        scan.close();
    }
}
