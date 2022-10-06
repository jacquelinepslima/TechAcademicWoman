package exercicio.uri.isabel_oliveira.util;

public class EscolhaCasoFor {
    public static void main(String[] args) {
        int dia=7;
       /* if(dia==1){
            System.out.println("O hoje é: Domingo");
        }
        else if(dia==2){
            System.out.println("O hoje é: Segunda");
        }
        else if(dia==3){
            System.out.println("O hoje é: Terça");
        }
        else if(dia==4){
            System.out.println("O hoje é: Quarta");
        }
        else if(dia==5){
            System.out.println("O hoje é: Quinta");
        }
        else if(dia==6){
            System.out.println("Hoje é: Sexta");
        }
        else if(dia==7) {
            System.out.println("Hoje é : Sábado");
        }*/
        switch (dia){
            case 1:
                System.out.println("O hoje é: Domingo");
            break;
            case 2:
                System.out.println("O hoje é: Segunda");
            break;
            case 3:
                System.out.println("O hoje é: Terça");
            break;
            case 4:
                System.out.println("O hoje é: Quarta");
            break;
            case 5:
                System.out.println("O hoje é: Quinta");
            break;
            case 6:
                System.out.println("Hoje é: Sexta");
            break;
            case 7:
                System.out.println("Hoje é : Sábado");
            break;
            default:
                System.out.println("Dia inválido");
        }
    }
}
