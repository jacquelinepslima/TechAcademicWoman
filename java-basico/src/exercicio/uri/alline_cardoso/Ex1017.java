package exercicio.uri.alline_cardoso;

import java.util.Locale;
import java.util.Scanner;

public class Ex1017 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        int tempo = scan.nextInt();
        int veloc = scan.nextInt();

        int distancia = tempo * veloc;


        /* aqui precisa  ter pelo menos 1 dos valor em double para sofre um
            casting implicito

            casting = conversao de uma tipo de dados maior para uma menor
            Referencia de leitura
            https://mauriciogeneroso.medium.com/java-oca-1z0-808-2-1-tipos-de-dados-vari%C3%A1veis-vari%C3%A1veis-primitivas-e-de-refer%C3%AAncia-c8f007756bc5

             Preferir fazer o casting explicito BOAS PRATICAS
         */

        double litros = (double) distancia / 12;

        System.out.printf("%.3f litros", litros);
        System.out.println();

        scan.close();
    }
}