package exercicio.uri.rebeca_lira.util;

public class EscolhaCasoFor {

    public static void main(String[] args) {

        int dia = 7;
        String diaSemana = "";

        if (dia == 1) {
            diaSemana = "domingo";
        } else if (dia == 2) {
            diaSemana = "segunda-feira";
        } else if (dia == 3){
            diaSemana = "terça-feira";
        } else if (dia == 4) {
            diaSemana = "quarta-feira";
        } else if (dia == 5) {
            diaSemana = "quinta-feira";
        } else if (dia == 6) {
            diaSemana = "sexta-feira";
        } else if (dia == 7) {
            diaSemana = "sábado";
        }

        System.out.println("Hoje é: " + diaSemana);

        System.out.println();
        System.out.println();
        System.out.println();

        // OUTRA FORMA DE RESOLVER

        switch (dia) {
            case 1:
                diaSemana = "domingo";
                break;
            case 2:
                diaSemana = "segunda-feira";
                break;
            case 3:
                diaSemana = "terça-feira";
                break;
            case 4:
                diaSemana = "quarta-feira";
                break;
            case 5:
                diaSemana = "quinta-feira";
                break;
            case 6:
                diaSemana = "sexta-feira";
                break;
            case 7:
                diaSemana = "sábado";
                break;
            default:
                diaSemana = "dia inválido";
        }

        System.out.println("Hoje é: " + diaSemana);
        }
    }

