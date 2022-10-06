package exercicio.uri.ana_caroline;

import java.util.Scanner;

public class Ex1101 {
    public static void main(String[] args) {

        Scanner exerc = new Scanner(System.in);

        int M = exerc.nextInt();
        int N = exerc.nextInt();
        int cont;
        int soma = 0;

        if((M > 0) && (N > 0)){
            if(M > N){
                for(cont = N; cont <= M; cont++){
                    System.out.print(N + " ");
                    soma += N;
                    N++;
                }
            }

            else if(N > M){
                for(cont = M; cont <= N; cont++){
                    System.out.print(M + " ");
                    soma += M;
                    M++;
                }
            }
            System.out.print("Sum=" + soma);
        }
        exerc.close();
    }
}
