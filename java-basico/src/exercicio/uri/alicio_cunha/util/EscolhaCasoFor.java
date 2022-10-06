package exercicio.uri.alicio_cunha.util;

import java.util.Date;
import java.util.logging.SimpleFormatter;

public class EscolhaCasoFor {

    public static void main(String[] args) {

        int dia = 3;
        // utilizar o if else
        String diaSemana = "";
        /*if(dia == 1){
            diaSemana = "Domingo";
        }else if(dia == 2){
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
            diaSemana = "Sabado";
        }else{
            diaSemana = "Dia inválido";
        }

        System.out.println("O hoje é: " + diaSemana);

        Resultado esperado
            O hoje é: Terca
         */
        System.out.println();
        System.out.println();
        System.out.println();

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
