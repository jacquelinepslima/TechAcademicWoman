package exercicio.uri.ana_cruz;

import java.util.Locale;
import java.util.Scanner;

public class Ex1035 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int A, B, C, D;

        A = scanner.nextInt();
        B = scanner.nextInt();
        C = scanner.nextInt();
        D = scanner.nextInt();

        int soma1 = C + D, soma2 = A + B;

        if(((B > C) && (D > A)) && (soma1 > soma2) && (C > 0) && (D > 0)){
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }

        scanner.close();
    }
}
