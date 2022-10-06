package exercicio.uri.inajara_pereira;

import java.util.Scanner;

public class Ex1132 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int X,Y,soma=0,i=0;
        X=sc.nextInt();
        Y=sc.nextInt();

        if (X<Y){
            for(i=X;i<=Y;i++){
                if(i%13!=0){
                    soma+=i;
                }
            }
        }else{
            for(i=Y;i<=X;i++){
                if(i%13!=0){
                    soma+=i;
                }
            }
        }
        System.out.println(soma);
        sc.close();
    }
}
