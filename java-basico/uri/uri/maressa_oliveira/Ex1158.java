package exercicio.uri.maressa_oliveira;

import java.util.Scanner;

public class Ex1158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N,x,y,i=0,impar = 0,soma=0,atual=0;
        N=sc.nextInt();

        for (i=0;i<N;i++){
            x= sc.nextInt();
            y= sc.nextInt();
            impar=x;
            while (atual<y){
                if (!(impar%2==0)){
                    soma += impar;
                    atual++;
                }
                impar++;
            }
            System.out.println(soma);
            soma=0;
            atual=0;
        }

        sc.close();
    }
}
