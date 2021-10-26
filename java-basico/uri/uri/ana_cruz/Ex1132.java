package exercicio.uri.ana_cruz;

import java.util.Scanner;

public class Ex1132 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();
        int soma = 0;

        for (int i=0; i<=Math.abs(N2-N1); i++){
            int inicio = Math.min(N1,N2);
            if ((inicio+i)%13!=0)
                soma += (inicio+i);
        }
        System.out.println(soma);
        sc.close();
    }
}
