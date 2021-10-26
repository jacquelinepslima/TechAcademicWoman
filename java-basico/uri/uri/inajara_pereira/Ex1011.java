package exercicio.uri.inajara_pereira;

import java.util.Locale;
import java.util.Scanner;

public class Ex1011 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //O arquivo de entrada contém um valor de ponto flutuante (dupla precisão).
        double r = sc.nextDouble();
        double pi = 3.14159;

        //Ao utilizar a fórmula, procure usar (4/3.0) ou (4.0/3).
        double volume = (4 / 3.0) * pi * Math.pow(r, 3);

        System.out.printf("VOLUME = %.3f%n", volume);

        sc.close();
    }
}
