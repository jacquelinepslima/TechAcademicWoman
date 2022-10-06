package exercicio.uri.byanca_calixto.util;

import java.util.Scanner;

public class EscolhaCasoFor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int dia = sc.nextInt();
        String diaSemana;

        /*
        if (dia == 1){
            diaSemana = "Domingo";
        }
        else if (dia == 2){
            diaSemana = "Segunda-Feira";
        }
        else if (dia == 3) {
            diaSemana = "Terça-Feira";
        }
        else if (dia == 4) {
            diaSemana = "Quarta-Feira";
        }
        else if (dia == 5) {
            diaSemana = "Quinta-Feira";
        }
        else if (dia == 6) {
            diaSemana = "Sexta-Feira";
        }
        else if (dia == 7) {
            diaSemana = "Sábado";
        }
        else {
            diaSemana = "Opção invalida";
        }*/

        switch (dia){
            case 1:
                diaSemana = "Domingo";
                break;
            case 2:
                diaSemana = "Segunda-Feira";
                break;
            case 3:
                diaSemana = "Terça-Feira";
                break;
            case 4:
                diaSemana = "Quarta-Feira";
                break;
            case 5:
                diaSemana = "Quinta-Feira";
                break;
            case 6:
                diaSemana = "Sexta-Feira";
                break;
            case 7:
                diaSemana = "Sabado";
                break;
            default:
                diaSemana = "dia inválido";

        }
        System.out.println("hoje é: "+diaSemana);


    }
}
