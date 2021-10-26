package exercicio.uri.valquiria_matter.util;

import java.util.Scanner;

public class EscolhaCasoFor {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int dia = scan.nextInt();
        String diaSemana = "";

        if(dia == 1){
            diaSemana = "Domingo";
        }else if (dia == 2){
            diaSemana = "Segunda";
        }else if(dia == 3){
            diaSemana = "Terca";
        }else if(dia == 4){
            diaSemana = "Quarta";
        }else if(dia == 5){
            diaSemana = "Quinta";
        }else if(dia == 6){
            diaSemana = "Sexta";
        }else if(dia == 7){
            diaSemana = "Sábado";
        }else{
            diaSemana = ("Dia Inválido");
        }

        System.out.println("Hoje é:" + diaSemana);

        System.out.println("");

        switch (dia){
            case 1: diaSemana = "Domingo"; break;
            case 2: diaSemana = "Segunda"; break;
            case 3: diaSemana = "Terca"; break;
            case 4: diaSemana = "Quarta"; break;
            case 5: diaSemana = "Quinta"; break;
            case 6: diaSemana = "Sexta"; break;
            case 7: diaSemana = "Sabado"; break;
            default: diaSemana = "Dia Inválido";
        }

        System.out.println("Hoje é: " + diaSemana);





    }

}
