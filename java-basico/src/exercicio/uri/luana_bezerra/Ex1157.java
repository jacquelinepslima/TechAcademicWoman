package exercicio.uri.luana_bezerra;

import java.util.Scanner;

public class Ex1157 {
    public static void main(String[] args) {
        Scanner exercicio = new Scanner(System.in);

        int N = exercicio.nextInt();
        int x;
        int divisor = 1;

        for(x = 0; x < N + 1; x++){
            int resto = N % (divisor);
            if(resto == 0){
                System.out.println(divisor);
            }
            divisor++;
        }

        exercicio.close();
    }
}
