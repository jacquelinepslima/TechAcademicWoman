package exercicio.uri.valquiria_matter;

import java.util.Locale;
import java.util.Scanner;

public class Ex1017 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o tempo gasto na viagem em horas");
        int horas = scan.nextInt();

        System.out.println("Digite a velocidade média em km/h");
        int velocidade = scan.nextInt();

        double quantidadeLitros = (double) (horas * velocidade) / 12.0;

        System.out.printf("%.3f",quantidadeLitros);

        scan.close();



    }

}
