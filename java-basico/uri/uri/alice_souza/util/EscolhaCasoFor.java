package exercicio.uri.alice_souza.util;

import java.util.Scanner;

public class EscolhaCasoFor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dia = scan.nextInt();
        System.out.printf("hoje é ");
/*Resolucao com IF ELSE
        if (dia == 1) {
            System.out.println("domingo");}
        else if (dia == 2) {
            System.out.println("segunda");}
        else if (dia == 3) {
            System.out.println("terça");}
        else if (dia == 4) {
            System.out.println("quarta");}
        else if (dia == 5) {
            System.out.println("quinta");}
        else if (dia == 6) {
            System.out.println("sexta");}
        else if (dia == 7) {
            System.out.println("sabado");}
        else {
            System.out.println("numero inválido");
    }
*/
        switch (dia){
            case 1: System.out.println("domingo");
                break;
            case 2: System.out.println("segunda");
                 break;
            case 3: System.out.println("terça");
                break;
            case 4: System.out.println("quarta");
                break;
            case 5: System.out.println("quinta");
                break;
            case 6: System.out.println("sexta");
                break;
            case 7: System.out.println("sabado");
                break;
            default:
                System.out.println("oooops. esse número é inválido");
        }
        scan.close();

    }
}