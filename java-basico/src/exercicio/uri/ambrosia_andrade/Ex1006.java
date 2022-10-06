package exercicio.uri.ambrosia_andrade;

import java.util.Scanner;

public class Ex1006 {
    public static void main(String[] args){

        double A, B, C, MEDIA;

        Scanner scanner = new Scanner(System.in);

        A = scanner.nextDouble();
        B = scanner.nextDouble();
        C = scanner.nextDouble();

        MEDIA = ((A * 2) + (B * 3) + (C * 5))/10;

        System.out.printf("MEDIA = %.1f", MEDIA);

        scanner.close();
    }
}
