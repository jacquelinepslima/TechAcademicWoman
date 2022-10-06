package exercicio.uri.maressa_oliveira;

import java.util.Scanner;

public class Ex1019 {

    public static void main(String[] args) {

        //Operador MOD --> %
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int hr, min, seg, restoDivisao;

        hr = N/3600;
        restoDivisao = N % 3600;

        min = restoDivisao / 60;
        seg = restoDivisao % 60;

        System.out.println(hr+":"+min+":"+seg);

        scanner.close();
    }
}
