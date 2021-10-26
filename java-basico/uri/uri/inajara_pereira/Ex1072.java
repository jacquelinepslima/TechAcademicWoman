package exercicio.uri.inajara_pereira;

import java.util.Scanner;

public class Ex1072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N,i,cont = 0,dentro=0,fora=0;
        N=sc.nextInt();

        for (i=0; i<N; i++){
            int x=sc.nextInt();
            if((x<10)||(x>20)) {
                fora++;

            }else if ((x>=10)||(x<=20)){
                dentro++;

            }
        }
        System.out.println(fora + " out");
        System.out.println(dentro + " in");
        sc.close();
    }
}