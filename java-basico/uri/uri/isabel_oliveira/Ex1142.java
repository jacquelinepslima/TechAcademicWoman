package exercicio.uri.isabel_oliveira;
import java.util.Scanner;
public class Ex1142 {
    public static void main(String[] args) {
        int N, numeroatual=1,count=0;
        Scanner sc=new Scanner(System.in);
        N= sc.nextInt();
        for(int i=1;i<=N;i++){
            while (count<3){
                System.out.print(numeroatual+ " ");
                numeroatual++;
                count++;
            }
            System.out.println("PUM");
            count=0;
            numeroatual++;

        }
    }
}
