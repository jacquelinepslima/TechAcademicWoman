package exercicio.uri.palloma_soares;

import java.util.Scanner;

public class Ex1019 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int hr, min, seg;

        double restoDivisao;

        hr = N / 3600;
        restoDivisao = N % 3600;

        min = (int)(restoDivisao / 60);
        seg = (int) ( restoDivisao % 60);

        System.out.println(hr + ":" + min + ":" + seg);

        scanner.close();
    }
}