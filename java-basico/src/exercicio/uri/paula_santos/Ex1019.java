package exercicio.uri.paula_santos;

import java.util.Scanner;

public class Ex1019 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int hr, min, seg, restoDiv;

        hr = N/3600;
        restoDiv = N % 3600;

        min = restoDiv/60;
        seg = restoDiv%60;

        System.out.println(hr + ":" + min + ":" + seg);

        scanner.close();
    }

}
