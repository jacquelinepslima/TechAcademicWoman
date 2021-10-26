package exercicio.uri.ana_melo;

import java.util.Locale;
import java.util.Scanner;

public class Ex1017 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int tempoGasto = sc.nextInt();
        int velocidadeMed = sc.nextInt();

        //outra resolucao casting implicito (de um menor para um maior), em que pelo menos um precisa estar double
        //double litrosCombustivel = (double) tempoGasto * velocidadeMed/12.0;

        //casting explicito ** fazer preferencialmente este ** boas praticas
        //double litrosCombustivel = (double) tempoGasto * velocidadeMed/12;

        double litrosCombustivel = Double.valueOf(tempoGasto) * Double.valueOf(velocidadeMed) / 12;

        System.out.printf("%.3f", litrosCombustivel);

        sc.close();
    }
}