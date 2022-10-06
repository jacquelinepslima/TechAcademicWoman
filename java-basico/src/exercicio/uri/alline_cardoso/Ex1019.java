package exercicio.uri.alline_cardoso;

import java.util.Scanner;

public class Ex1019 {
    public static void main(String[] args) {

        //OPERADOR MOD
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int hr, min, seg, restoDivisao;

        hr = N / 3600;
        restoDivisao = N % 3600;

        min = restoDivisao / 60;
        seg = restoDivisao % 60;

        System.out.println(hr + ":" + min + ":" + seg);

        scan.close();
    }
}
