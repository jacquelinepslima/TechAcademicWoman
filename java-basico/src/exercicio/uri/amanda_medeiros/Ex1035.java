package exercicio.uri.amanda_medeiros;

import java.util.Scanner;

public class Ex1035 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int A, B, C, D, somaCD, somaAB;

        A = scanner.nextInt();
        B = scanner.nextInt();
        C = scanner.nextInt();
        D = scanner.nextInt();

        somaCD = C + D;
        somaAB = A + B;

        if(B > C && D > A && somaCD > somaAB && somaCD > 0 && somaAB > 0 && A % 2 == 0){
            System.out.println("Valores aceitos");

        } else {
            System.out.println("Valores não aceitos");
        }
        scanner.close();
    }
}
