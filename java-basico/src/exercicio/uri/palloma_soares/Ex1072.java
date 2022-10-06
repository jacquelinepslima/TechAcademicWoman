package exercicio.uri.palloma_soares;

import java.util.Scanner;

public class Ex1072 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N, X = 0, qnt = 0, qnt2 = 0;

        N = sc.nextInt();

        for(int i=0; i<N; i++){
            X = sc.nextInt();
            if(X >= 10 && X <= 20){
                qnt++;
            }
            else{
                qnt2++;
            }
        }

        System.out.println(qnt+" in");
        System.out.println(qnt2+" out");


        sc.close();
    }
}
