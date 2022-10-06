package exercicio.uri.amanda_medeiros;
import java.util.Scanner;

public class Ex1157 {
    public static void main(String[] args) {
        int N;
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        for(int i=0;i<=N;i++){
            if(i!=0){
                if(N%i==0){
                    System.out.println(i);
                }
            }
        }
    }
}
