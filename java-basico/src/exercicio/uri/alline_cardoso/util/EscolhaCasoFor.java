package exercicio.uri.alline_cardoso.util;

import java.util.Scanner;

public class EscolhaCasoFor {

    public static void main(String[] args) {

        int dia;
        String diaSemana;
        System.out.println("Digite um número de 1 a 7: ");
        Scanner scan = new Scanner(System.in);

        dia = scan.nextInt();

       /* if (dia == 1) {
            System.out.println("Hoje é domingo");
        } else if (dia == 2){
            System.out.println("Hoje é segunda");
        } else if (dia == 3){
            System.out.println("Hoje é terça");
        } else if (dia == 4){
            System.out.println("Hoje é quarta");
        } else if (dia == 5){
            System.out.println("Hoje é quinta");
        } else if (dia == 6){
            System.out.println("Hoje é sexta");
        } else if (dia == 7){
            System.out.println("Hoje é sexta");
        } else {
            System.out.println("Digite um número válido de 1 a 7");*/

        switch(dia) {
            case 1:
                diaSemana = "Domingo";
                break;
            case 2:
                diaSemana = "Segunda";
                break;
            case 3:
                diaSemana = "Terça";
                break;
            case 4:
                diaSemana = "Quarta";
                break;
            case 5:
                diaSemana = "Quinta";
                break;
            case 6:
                diaSemana = "Sexta";
                break;
            case 7:
                diaSemana = "Sábado";
                break;
            default:
                diaSemana = "Digite uma número válido de 1 a 7";
        }
        System.out.println("Hoje é: " + diaSemana);

        scan.close();
    }



        /*
        * Resultado esperado
        * o hoje é: Terça
        *
        * */
    }

