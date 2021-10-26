package exercicio.uri.isabel_oliveira;
import java.util.Scanner;
public class Ex04 {
    public static void main(String[] args) {
        int N,soma;
        soma=0;
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        int[][] matriz=new int[N][N];
        for(int i=0;i<N;i++){
            for (int j=0;j<N;j++){
                matriz[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<N;i++){
            for (int j=0;j<N;j++){
                if(i<j){
                    soma+= matriz[i][j];
                }
            }
        }
        System.out.println(soma);
        sc.close();
    }
}