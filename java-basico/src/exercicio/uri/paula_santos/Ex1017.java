package exercicio.uri.paula_santos;

import java.util.Locale;
import java.util.Scanner;

public class Ex1017 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int tempo = scanner.nextInt();
        int velocidademedia = scanner.nextInt();

        double combustivel = tempo*velocidademedia /12.0;

        System.out.printf("%.3f %n", combustivel);

        scanner.close();
    }
}
