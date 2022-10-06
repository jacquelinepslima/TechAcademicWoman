package exercicio.uri.valquiria_matter;

import java.util.Locale;
import java.util.Scanner;

public class Ex1016 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a distancia em km");
        int km = scan.nextInt();

        int tempo = km * 2;

        System.out.println(tempo + " minutos");

        scan.close();
    }
}