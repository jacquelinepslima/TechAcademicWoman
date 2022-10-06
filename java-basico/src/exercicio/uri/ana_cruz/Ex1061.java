package exercicio.uri.ana_cruz;

import java.util.Scanner;

public class Ex1061 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dias, hr, min, seg;
        String entrada;

        entrada = scanner.next();
        int Dia1 = scanner.nextInt();
        int hora1 = scanner.nextInt();
        entrada = scanner.next();
        int min1 = scanner.nextInt();
        entrada = scanner.next();
        int seg1 = scanner.nextInt();

        entrada = scanner.next();
        int Dia2 = scanner.nextInt();
        int hora2 = scanner.nextInt();
        entrada = scanner.next();
        int min2 = scanner.nextInt();
        entrada = scanner.next();
        int seg2 = scanner.nextInt();

        int N1 = 86400*Dia1 + 3600*hora1 + 60*min1 + seg1; // Transformando em segundos
        int N2 = 86400*Dia2 + 3600*hora2 + 60*min2 + seg2;
        int difN = N2 - N1; // Fazendo a diferença em segundos

        dias = difN/86400;
        hr = (difN%86400)/3600;
        min = ((difN%86400)%3600)/60;
        seg = ((difN%86400)%3600)%60; // Convertendo a diferença em segundos para dias, horas, min, e seg

        System.out.println(dias + " dia(s)");
        System.out.println(hr + " hora(s)");
        System.out.println(min + " minuto(s)");
        System.out.println(seg + " segundo(s)");

        scanner.close();
    }

}
