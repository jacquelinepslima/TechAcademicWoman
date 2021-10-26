package exercicio.uri.isabel_oliveira;
import java.util.Scanner;

public class Ex1158 {
    public static void main(String[] args) {
        int N,numeroAtual=0,X,Y,count=0,soma=0;
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        for(int i=0;i<N;i++){
            X=sc.nextInt();
            Y=sc.nextInt();
            numeroAtual=X;
            while (count<Y) {
                if(numeroAtual%2==1){
                    soma+=numeroAtual;
                    count++;

                }
                numeroAtual++;
            }
            System.out.println(soma);
            soma=0;
            count=0;

        }
    }
}
