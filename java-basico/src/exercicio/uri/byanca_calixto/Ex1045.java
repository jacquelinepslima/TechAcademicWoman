package exercicio.uri.byanca_calixto;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Ex1045 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);

        float A, B, C;
        float menor, meio, maior;

        A = scanner.nextFloat();
        B = scanner.nextFloat();
        C = scanner.nextFloat();

        if (A > B && A > C) {
            maior = A;
        } else if (B > A && B > C) {
            maior = B;
        } else if (C > A && C > B) {
            maior = C;
        }

        
        if (A < B && A < C) {
            menor = A;
        } else if (B < A && B < C) {
            menor = B;
        } else if (C < A && C < B) {
            menor = C;
        }

        if (A > B && A < C) {
            meio = A;
        } else if (A > C && A < B) {
            meio = A;
        } else if (B > A && B < C) {
            meio = C;
        } else if (B > C && B < A) {
            meio = C;
        } else if (C > A && C < B) {
            meio = C;
        } else if (C > B && C < A) {
            meio = C;
        }

        if (A >= B + C) {
            out.println("NÃO FORMA TRIÂNGULO.");
        }

        if (A * A == B * B + C * C) {
            out.println("TRIÂNGULO RETÂNGULO.");
        }

        if (A * A > B * B + C * C) {
            out.println("TRIÂNGULO OBTUSÂNGULO");
        }

        if (A * A < B * B + C * C) {
            out.println("TRIÂNGULO ACUTÂNGULO.");
        }

        if (A == B && A == C) {
            out.println("TRIÂNGULO EQUILÁTERO.");
        }

        if ((A = B) != C) {
            out.println("TRIÂNGULO ISÓSCELES.");
        } else if ((A = C) != B) {
            out.println("TRIÂNGULO ISÓSCELES.");
        } else if ((B = C) != A) {
            out.println("TRIÂNGULO ISÓSCELES.");
        }

        scanner.close();
    }
}
