package exercicio.uri.evelin_ferraz;

import java.util.Scanner;

public class Ex1049 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String vertebra = scanner.nextLine();
        String classe = scanner.nextLine();
        String alimentacao = scanner.nextLine();

        if (vertebra.equals("vertebrado")) {
            if (classe.equals("ave")) {
                if (alimentacao.equals("carnivoro")) {
                    System.out.println("aguia");
                } else {
                    System.out.println("pomba");
                }
            } else {
                if (alimentacao.equals("onivoro")) {
                    System.out.println("homem");
                }
                else{
                    System.out.println("vaca");}
            }
        }
        else{
            if(classe.equals("inseto")){
                if(alimentacao.equals("hematofago")){
                    System.out.println("pulga");
                }
                else{
                    System.out.println("lagarta");
                }
            }
            else{
                if(alimentacao.equals("hematofago")){
                    System.out.println("sanguessuga");
                }
                else {

                    System.out.println("minhoca");}
                }
            }
        }
    }



