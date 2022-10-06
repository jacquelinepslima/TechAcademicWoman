package exercicio.uri.ambrosia_andrade;

import java.util.Scanner;

public class Ex1005 {
    public static void main(String[] args){

        double A, B, MEDIA;

        Scanner scanner = new Scanner(System.in);

        A = scanner.nextDouble();
        B = scanner.nextDouble();

        MEDIA = ((A * 3.5) + (B * 7.5))/11;

        System.out.printf("MEDIA = %.5f", MEDIA);

        scanner.close();

    }
}
