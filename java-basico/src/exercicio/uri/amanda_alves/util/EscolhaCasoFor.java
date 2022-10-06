package exercicio.uri.amanda_alves.util;

import java.util.Scanner;

public class EscolhaCasoFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o dia:");
        int dia = scanner.nextInt();

        String diaDaSemana = "nem sei";

        if (dia == 1) {
            diaDaSemana = "domingo!";
        } else if (dia == 2) {
            diaDaSemana = "segunda!";
        } else if (dia == 3) {
            diaDaSemana = "terça!";
        } else if (dia == 4) {
            diaDaSemana = "quarta!";
        } else if (dia == 5) {
            diaDaSemana = "quinta!";
        } else if (dia == 6) {
            diaDaSemana = "sexta!";
        } else if (dia == 7) {
            diaDaSemana = "sabado!";
        }

        System.out.println("Hoje é " + diaDaSemana);

        switch (dia) {
            case 1:
                diaDaSemana = "domingo";
                break;
            case 2:
                diaDaSemana = "segunda";
                break;
            case 3:
                diaDaSemana = "terça";
                break;
            case 4:
                diaDaSemana = "quarta";
                break;
            case 5:
                diaDaSemana = "quinta";
                break;
            case 6:
                diaDaSemana = "sexta";
                break;
            case 7:
                diaDaSemana = "sabado";
                break;
            default: diaDaSemana = "INVALIDO";
        }
        System.out.println("Hoje é: " + diaDaSemana + "!");
    }

}
