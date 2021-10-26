package exercicio.uri.alice_souza;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        int A,B;
        Scanner sc=new Scanner(System.in);
        A=sc.nextInt();
        B= sc.nextInt();
        int[][] matrizA= new int[A][B];
        int[][] matrizB= new int[A][B];
        int[][] matrizC= new int[A][B];
        for(int i=0;i<A;i++){
            for(int j=0;j<B;j++){
                matrizA[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<A;i++){
            for(int j=0;j<B;j++){
                matrizB[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<A;i++){
            for(int j=0;j<B;j++){
                matrizC[i][j]=matrizA[i][j]+matrizB[i][j];
            }
        }
        for(int i=0;i<A;i++){
            for(int j=0;j<B;j++){
                if(j!=B-1){
                    System.out.print(matrizC[i][j]+" ");
                }
                else{
                    System.out.println(matrizC[i][j]);
                }
            }
        }
        sc.close();
    }
}
