package exercicio.uri.alice_souza;

import java.util.Locale;
import java.util.Scanner;

public class Ex1016 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int distancia = sc.nextInt();
        System.out.printf("%d minutos", distancia*2);
        sc.close();
    }
}
