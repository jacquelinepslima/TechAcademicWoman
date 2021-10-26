package exercicio.uri.byanca_calixto;

import java.util.Scanner;

public class Ex1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        N=sc.nextInt();

        for (int i=1;i<=N;i++){
            //se o resto da divisao do valor N pelo valor do indice for = 0 ele imprime, se não passa a diante e corre até i for menor igual ao valor N
            if (N%i==0){
                System.out.println(i);
            }
        }

        sc.close();
    }
}
