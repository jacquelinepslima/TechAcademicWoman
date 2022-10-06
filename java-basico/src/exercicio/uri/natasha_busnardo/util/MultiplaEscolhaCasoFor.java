package exercicio.uri.natasha_busnardo.util;

import java.util.Scanner;

public class MultiplaEscolhaCasoFor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int dia = sc.nextInt();
        String diaSemana = "";

        /*if(dia == 1)
            System.out.println("Domingo");
        else if(dia == 2)
            System.out.println("Segunda");
        else if(dia == 3)
            System.out.println("Terça");
        else if(dia == 4)
            System.out.println("Quarta");
        else if(dia == 5)
            System.out.println("Quinta");
        else if(dia == 6)
            System.out.println("Sexta");
        else if(dia == 7)
            System.out.println("Sábado");
        else
            System.out.println("Valor inválido.");*/

        sc.close();

        switch (dia) { // 1
            case 1:
                diaSemana = "Domingo";
                break;
            case 2:
                diaSemana = "Segunda";
                break;
            case 3:
                diaSemana = "Terca";
                break;
            case 4:
                diaSemana = "Quarta";
                break;
            default:
                diaSemana = "Dia inválido";
        }
        System.out.println("O hoje é: " + diaSemana);

    }
}
