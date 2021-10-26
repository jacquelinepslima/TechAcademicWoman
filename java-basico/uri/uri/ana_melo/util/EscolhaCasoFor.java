package exercicio.uri.ana_melo.util;
import java.util.Scanner;

public class EscolhaCasoFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia = sc.nextInt();
        String diaSemana = "";

        /*
        if (dia == 1){
            diaSemana = "Domingo";
        } else if (dia == 2){
            diaSemana = "Segunda-feira";
        } else if (dia == 3){
            diaSemana = "Terça-feira";
        } else if (dia == 4){
            diaSemana = "Quarta-feira";
        } else if (dia == 5){
            diaSemana = "Quinta-feira";
        } else if (dia == 6){
            diaSemana = "Sexta-feira";
        } else {
            diaSemana = "Sábado";
        }

        System.out.println("Hoje é: " + diaSemana);
        sc.close();
        */

        switch (dia) {
            case 1:
                diaSemana = "Domingo";
                break;
            case 2:
                diaSemana = "Segunda-feira";
                break;
            case 3:
                diaSemana = "Terça-feira";
                break;
            case 4:
                diaSemana = "Quarta-feira";
                break;
            case 5:
                diaSemana = "Quinta-feira";
                break;
            case 6:
                diaSemana = "Sexta-feira";
                break;
            case 7:
                diaSemana = "Sábado";
            default:
                diaSemana = "Dia inválido";
        }

        System.out.println("Hoje é: " + diaSemana);
        sc.close();
    }
}
