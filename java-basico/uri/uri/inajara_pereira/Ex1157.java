package exercicio.uri.inajara_pereira;

import java.util.Scanner;

public class Ex1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N,div = 0,i=0;
        N=sc.nextInt();

        for(i=1;i<=N;i++){
                if(N%i==0) {
                    System.out.println(i);
                }
        }

        sc.close();
    }
}
