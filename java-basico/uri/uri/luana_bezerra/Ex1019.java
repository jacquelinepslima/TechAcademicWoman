package exercicio.uri.luana_bezerra;

import java.util.Scanner;

public class Ex1019 {
    public static void main(String[] args) {

        Scanner tempo = new Scanner(System.in);

        int N = tempo.nextInt();
        int hr, min, seg, restoDivisao;

        hr = N/3600;
        restoDivisao = N % 3600;

        min = restoDivisao / 60;
        seg = restoDivisao % 60;

        System.out.println(hr + ":" + min + ":" + seg);


        tempo.close();

    }
}
