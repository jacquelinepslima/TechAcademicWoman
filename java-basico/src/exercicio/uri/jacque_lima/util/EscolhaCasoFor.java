package exercicio.uri.jacque_lima.util;

import java.util.Scanner;

public class EscolhaCasoFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dia = 3;
        String diaSemana = "";

        /* if(dia == 1){
            diaSemana = "Domingo";
        }else if(dia == 2){
            diaSemana = "Segunda-feira";
        }else if(dia == 3){
            diaSemana = "Terça-feira";
        }else if(dia == 4){
            diaSemana = "Quinta-feira";
        }else if(dia == 5){
            diaSemana = "Sexta-feira";
        }else if(dia == 6){
            diaSemana = "Sabado";
        }else{
            diaSemana = "Nao corresponde a nenhum dia da semana";
        }

        System.out.println("Hoje é: " + diaSemana); */

        System.out.println();
        System.out.println();
        System.out.println();

        switch (dia){
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
                diaSemana = "Dia inválido";
                break;
        }
        System.out.println("Hoje é: " + diaSemana);
        sc.close();
    }
}

