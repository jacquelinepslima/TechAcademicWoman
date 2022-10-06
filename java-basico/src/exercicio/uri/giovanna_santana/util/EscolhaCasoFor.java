package exercicio.uri.giovanna_santana.util;

public class EscolhaCasoFor {

    public static void main(String[] args) {

        int dia = 3;
        String diaSemana = "";
        /*
        if (dia == 1){
            diaSemana = "Domingo";
        } else if (dia == 2){
            diaSemana = "Segunda";
        } else if (dia == 3){
            diaSemana = "Terca";
        }else if (dia == 4){
            diaSemana = "Quarta";
        }else if (dia == 5){
            diaSemana = "Quinta";
        } else if (dia == 6){
            diaSemana = "Sexta";
        }else {
            diaSemana = "Sabado";
        }

        System.out.println("O dia da semana é: " + diaSemana);
        /*
        Resultado esperado
            O hoje é: Terça
         */
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
                diaSemana = "Terca";
                break;
            case 4:
                diaSemana = "Quarta";
                break;
            case 5:
                diaSemana = "Quinta";
            case 6:
                diaSemana = "Sexta";
                break;
            case 7:
                diaSemana = "Sabado";
                break;
            default:
                diaSemana = "Dia inválido";
        }

        System.out.println("O dia da semana é: " + diaSemana);
    }
}
