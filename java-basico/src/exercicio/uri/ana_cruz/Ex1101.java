package exercicio.uri.ana_cruz;

import java.util.Scanner;

public class Ex1101 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int M = scan.nextInt();
        int N = scan.nextInt();
        while(M >0 && N >0){
            int maior= Math.max(M, N);
            int menor = Math.min(M, N);
            int soma=0;
            for(int i = menor;i<=maior;i++ ){
                System.out.print(i +" ");
                soma = soma +i;
            }
            System.out.println("Sum="+ soma);
            M = scan.nextInt();
            N = scan.nextInt();
        }
        scan.close();
    }
}
