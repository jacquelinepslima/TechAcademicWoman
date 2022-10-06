package exercicio.uri.evelin_ferraz.util;

public class EscolhaCasoFor {
    public static void main(String[] args) {

        int dia = 4;
        String diaSemana = "";

        /*
        if(dia == 1){
            diaSemana = "Segunda";
        } else if(dia == 2){
            diaSemana = "Terça";
        } else if(dia == 3){
            diaSemana = "Quarta";
        } else if(dia == 4){
            diaSemana = "Quinta";
        } else if(dia == 5){
            diaSemana = "Sexta";;
        } else if(dia == 6){
            diaSemana = "Sábado";
        } else if (dia == 7){
            diaSemana = "Domingo";
        } else {
            System.out.println("Dia inválido");
        }
        */

        switch (dia){
            case 1: diaSemana = "Segunda";
            break;
            case 2: diaSemana = "Terça";
            break;
            case 3: diaSemana = "Quarta";
            break;
            case 4: diaSemana = "Quinta";
            break;
            case 5: diaSemana = "Sexta";
            break;
            case 6: diaSemana = "Sábado";
            break;
            case 7: diaSemana = "Domingo";
            break;
            default: diaSemana = "Dia inválido!";
        }

        System.out.println("Hoje é: " + diaSemana);

    }
}
