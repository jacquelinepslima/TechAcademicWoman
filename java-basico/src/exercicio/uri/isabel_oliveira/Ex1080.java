package exercicio.uri.isabel_oliveira;
import java.util.Scanner;
public class Ex1080 {
    public static void main(String[] args) {
        int[] numeros=new int[100];
        Scanner sc=new Scanner(System.in);
        int maior,posicao;
        maior=0;
        posicao=0;
        for (int i=0;i<100;i++){
            numeros[i]=sc.nextInt();
            if(maior<numeros[i]){
                maior=numeros[i];
                posicao=i+1;
            }
        }
        System.out.println(maior);
        System.out.println(posicao);
    }
}
