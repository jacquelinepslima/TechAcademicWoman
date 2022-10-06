package exercicio.uri.alice_souza;

import java.util.Scanner;

public class Ex1132 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();
        int soma = 0;

        for (int i=0; i<=(N2-N1); i++){
            if ((N1+i)%13!=0)
                soma += (N1+i);
        }
        System.out.println(soma);
        sc.close();
    }
}
