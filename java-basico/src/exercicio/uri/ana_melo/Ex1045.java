package exercicio.uri.ana_melo;

import java.util.Locale;
import java.util.Scanner;

public class Ex1045 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b, c, A, B, C;

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        if (a > b && a > c){
            A = a;
            if (b > c){
                B = b;
                C = c;
            } else {
                B = c;
                C = b;
            }
        } else if (b > c) {
            A = b;
            if (a > c){
                B = a;
                C = c;
            } else {
                B = c;
                C = a;
            }
        } else {
            A = c;
            if (a > b){
                B = a;
                C = b;
            } else {
                B = b;
                C = a;
            }
        }

        if (A >= B + C){
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (Math.pow(A, 2) == Math.pow(B, 2) + Math.pow(C, 2)) {
                System.out.println("TRIANGULO RETANGULO");
            }
            if (Math.pow(A, 2) > Math.pow(B, 2) + Math.pow(C, 2)) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if (Math.pow(A, 2) < Math.pow(B, 2) + Math.pow(C, 2)) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (A == B && B == C && A == C) {
                System.out.println("TRIANGULO EQUILATERO");
            }
            if (A == B && B != C || B == C && C != A || A == C && C != B) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
        sc.close();

    }
}
