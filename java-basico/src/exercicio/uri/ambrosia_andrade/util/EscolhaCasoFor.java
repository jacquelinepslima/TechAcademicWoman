package exercicio.uri.ambrosia_andrade.util;

public class EscolhaCasoFor {
    public static void main(String[] args) {
        int dia = 3;
        String diaSemana = "";

        // 1 é domingo ... 3 é terça
        if(dia == 1) {
            diaSemana = "Domingo";
        } else if (dia == 2) {
            diaSemana = "Segunda";
        } else if (dia == 3) {
            diaSemana = "Terça";
        } else if (dia == 4) {
            diaSemana = "Quarta";
        } else if (dia == 5) {
            diaSemana = "Quinta";
        } else if (dia == 6) {
            diaSemana = "Sexta";
        } else if (dia == 7) {
            diaSemana = "Sábado";
        } else {
            diaSemana = "Dia inválido";
        }

        System.out.println("Com o If e Else\n\tHoje é: " + diaSemana);

        // Switch

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
        }

        System.out.println("Com o Switch\n\tHoje é: " + diaSemana);

    }
}
