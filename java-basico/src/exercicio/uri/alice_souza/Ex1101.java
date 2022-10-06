package exercicio.uri.alice_souza;

import java.util.Scanner;

public class Ex1101 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int M;
        int N;
        do{
            M = scan.nextInt();
            N = scan.nextInt();
            int maior= Math.max(M, N);
            int menor = Math.min(M, N);
            int soma=0;
            for(int i = menor;i<=maior;i++ ){
                System.out.print(i +" ");
                soma = soma +i;
            }
            System.out.println("Sum="+ soma);
        }while(M >0 && N >0);
        scan.close();
    }
}
