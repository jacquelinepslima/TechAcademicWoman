package exercicio.uri.alice_souza;

import java.util.Locale;
import java.util.Scanner;

public class Ex1017 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int tempo, velmedia;
        tempo = sc.nextInt();
        velmedia = sc.nextInt();
        System.out.printf("%.3f", ((double)velmedia*tempo/12));
        sc.close();
    }
}
