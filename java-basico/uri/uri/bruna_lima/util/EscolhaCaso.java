package exercicio.uri.bruna_lima.util;

import java.util.Scanner;

public class EscolhaCaso {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int dia = entrada.nextInt();
        String diaSemana = "";

        /*if(dia == 1)
            diaSemana = "domingo";
        else if(dia == 2)
            diaSemana = "segunda";
        else if(dia == 3)
            diaSemana = "terça";
        else if(dia == 4)
            diaSemana = "quarta";
        else if(dia == 5)
            diaSemana = "quinta";
        else if(dia == 6)
            diaSemana = "sexta";
        else if(dia == 7)
            diaSemana = "sábado";
        else
            System.out.println("Dia inválido.");

        System.out.println("Hoje é dia: " + diaSemana); //*/

        switch(dia) {
            case 1:
                diaSemana = "domingo";
                break;
            case 2:
                diaSemana = "segunda";
                break;
            case 3:
                diaSemana = "terça";
                break;
            case 4:
                diaSemana = "quarta";
                break;
            case 5:
                diaSemana = "quinta";
                break;
            case 6:
                diaSemana = "sexta";
                break;
            case 7:
                diaSemana = "sábado";
                break;
            default:
                System.out.println("Dia inválido.");
                break;
        }
        System.out.println("Hoje é dia: " + diaSemana);
    }
}
