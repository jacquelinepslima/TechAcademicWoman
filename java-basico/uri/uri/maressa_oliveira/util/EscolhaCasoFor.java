package exercicio.uri.maressa_oliveira.util;

import java.util.Scanner;

public class EscolhaCasoFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia;
        String diaSemana = "";
        dia=sc.nextInt();
        if (dia==1){
            diaSemana="Domingo";
            System.out.println("Hoje é "+diaSemana);
        }else if (dia==2){
            diaSemana="Segunda";
            System.out.println("Hoje é "+diaSemana);
        }else if (dia==3){
            diaSemana="Terça";
            System.out.println("Hoje é "+diaSemana);
        }else if (dia==4){
            diaSemana="Quarta";
            System.out.println("Hoje é "+diaSemana);
        }else if (dia==5){
            diaSemana="Quinta";
            System.out.println("Hoje é "+diaSemana);
        }else if (dia==6){
            diaSemana="Sexta";
            System.out.println("Hoje é "+diaSemana);
        }else if (dia==7){
            diaSemana="Sábado";
            System.out.println("Hoje é "+diaSemana);
        }else if((dia<=0)||(dia>=8)) {
            System.out.println("Valor informado inválido.");
        }
        System.out.println();
        switch (dia){
            case 1: diaSemana = "Domingo"; break;
            case 2: diaSemana = "Segunda"; break;
            case 3: diaSemana = "Terça"; break;
            case 4: diaSemana = "Quarta"; break;
            case 5: diaSemana = "Quinta"; break;
            case 6: diaSemana = "Sexta"; break;
            case 7: diaSemana = "Sábado"; break;
            default: diaSemana = "Dia inválido";
        }
        System.out.println("O dia informado é "+diaSemana);

    }
}
