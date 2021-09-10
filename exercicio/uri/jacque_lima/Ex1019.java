package exercicio.uri.jacque_lima;

import java.util.Scanner;

public class Ex1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int hr, min, seg, restoDivisao;

        hr = N / 3600;
        restoDivisao = N % 3600;

        min = restoDivisao / 60;
        seg = restoDivisao % 60;

        System.out.printf(hr + ":" + min + ":" + seg);

        sc.close();
    }
}
