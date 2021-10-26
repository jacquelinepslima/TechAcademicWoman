package exercicio.uri.ambrosia_andrade;

import java.util.Locale;
import java.util.Scanner;

public class Ex1116 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double div;

        int x = sc.nextInt();
        int y = sc.nextInt();

        if(y == 0){
            System.out.println("Divisão impossível");
        } else {
            div = (double) x / y;
            System.out.printf("%.1f", div);
        }

        sc.close();
    }
}
