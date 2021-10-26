package exercicio.uri.luana_bezerra;

import java.util.Locale;
import java.util.Scanner;

public class Ex1017 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner combustViagem = new Scanner(System.in);

        int tempo = combustViagem.nextInt();
        int velocidade = combustViagem.nextInt();

        double litrosCombust;

        litrosCombust = (double)tempo * velocidade / 12.0;

        System.out.printf("%.3f%n", litrosCombust);

        combustViagem.close();
    }
}