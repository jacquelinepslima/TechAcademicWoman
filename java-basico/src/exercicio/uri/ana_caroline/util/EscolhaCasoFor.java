package exercicio.uri.ana_caroline.util;

public class EscolhaCasoFor {

    public static void main(String[] args) {
        int dia = 3;
        String diaDaSemana;
      /*
        if(dia==1){
            diaDaSemana = "Domingo";
            System.out.println("Hoje é: " + diaDaSemana);
        }else if(dia==2){
            diaDaSemana = "Segunda";
            System.out.println("Hoje é: " + diaDaSemana);
        }else if(dia==3){
            diaDaSemana = "Terça";
            System.out.println("Hoje é: " + diaDaSemana);
        }else if(dia==4){
            diaDaSemana = "Quarta";
            System.out.println("Hoje é: " + diaDaSemana);
        }else if (dia==5){
            diaDaSemana = "Quinta";
            System.out.println("Hoje é: " + diaDaSemana);
        }else if(dia==6){
            diaDaSemana = "Sexta";
            System.out.println("Hoje é: " + diaDaSemana);
        }else if (dia==7){
            diaDaSemana = "Sábado";
            System.out.println("Hoje é: " + diaDaSemana);
        }else {
            System.out.println("Dia inválido");
        }

       */

        switch (dia){
            case 1:
                diaDaSemana = "Domingo";
                break;
            case 2:
                diaDaSemana = "Segunda";
                break;
            case 3:
                diaDaSemana = "Terça";
                break;
            case 4:
                diaDaSemana = "Quarta";
                break;
            case 5:
                diaDaSemana = "Quinta";
                break;
            case 6:
                diaDaSemana = "Sexta";
                break;
            case 7:
                diaDaSemana = "Sábado";
                break;
            default:
                diaDaSemana = "Dia inválido";
        }

        System.out.println("Hoje é: " + diaDaSemana);
    }

}
