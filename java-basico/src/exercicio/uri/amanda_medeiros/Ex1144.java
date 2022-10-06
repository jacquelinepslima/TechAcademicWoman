package exercicio.uri.amanda_medeiros;
import java.util.Scanner;

public class Ex1144 {
    public static void main(String[] args) {
        int N,indiceAtual;
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        for (int i=1;i<=N;i++){
            indiceAtual=i;
            System.out.print(i+" ");
            System.out.print(i*indiceAtual+" ");
            System.out.println(i*i*indiceAtual);
            System.out.print(i+" ");
            System.out.print(i*indiceAtual+1+" ");
            System.out.println(i*i*indiceAtual+1);
        }
    }
}
