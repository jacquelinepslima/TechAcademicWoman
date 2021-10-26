package exercicio.resolvido.jacque_lima;

import java.util.Locale;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if(A < B && A < C){
            System.out.printf("Menor é: %d", A);
        }else if(B < C){
            System.out.printf("Menor é: %d", B);
        }else{
            System.out.printf("Menor é: %d", C);
        }
        sc.close();
    }
}
