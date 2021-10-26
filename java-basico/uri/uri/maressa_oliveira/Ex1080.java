package exercicio.uri.maressa_oliveira;

import java.util.Scanner;

public class Ex1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int [100];
        int i,maior=0,posicao = 0;
        for (i=0;i<100;i++){
                num[i] = sc.nextInt();
            if(num[i]>maior){
                posicao=i+1;
                maior=num[i];
            }
        }
        System.out.println(maior);
        System.out.println(posicao);
        sc.close();
    }
}