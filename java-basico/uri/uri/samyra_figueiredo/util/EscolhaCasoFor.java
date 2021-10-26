package exercicio.uri.samyra_figueiredo.util;

public class EscolhaCasoFor {

    public static void main(String[] args) {

        int dia = 3;
        String diaSemana = "";

        if (dia == 1) {
            diaSemana = "Domingo";
        } else if (dia == 2) {
            diaSemana = "Segunda-Feira";
        } else if (dia == 3) {
            diaSemana = "Terça-Feira";
        } else if (dia == 4) {
            diaSemana = "Quarta-Feira";
        } else if (dia == 5) {
            diaSemana = "Quinta-Feira";
        } else if (dia == 6) {
            diaSemana = "Sexta-Feira";
        } else if (dia == 7){
            diaSemana = "Sábado";
        } else {
            diaSemana = "Dia Inválido";
        }

        System.out.println("-- com if / else -- Hoje é: " + diaSemana);
        System.out.println();
        System.out.println();

        switch (dia) {
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
            default:
                diaSemana = "Dia Inválido";
        }

        System.out.println("-- com switch -- Hoje é: " + diaSemana);
    }
}
