package exercicio.uri.alline_cardoso;

import java.util.Scanner;

public class Ex1049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String grupo = sc.nextLine();
        String classe = sc.nextLine();
        String alimentacao = sc.nextLine();

        if (grupo.equals("vertebrado")) {
            if (classe.equals("ave")) {
                if (alimentacao.equals("carnivoro"))
                    System.out.println("aguia");
                else if (alimentacao.equals("onivoro"))
                    System.out.println("pomba");
            }
            if (classe.equals("mamifero")) {
                if (alimentacao.equals("onivoro"))
                    System.out.println("homem");
                else if (alimentacao.equals("herbivoro"))
                    System.out.println("vaca");
            }
        } else if (grupo.equals("invertebrado")) {
            if (classe.equals("inseto")) {
                if (alimentacao.equals("hematofago"))
                    System.out.println("pulga");
                else if (alimentacao.equals("herbivoro"))
                    System.out.println("lagarta");
            }
            if (classe.equals("anelideo")) {
                if (alimentacao.equals("hematofago"))
                    System.out.println("sanguessuga");
                else if (alimentacao.equals("onivoro"))
                    System.out.println("minhoca");
            }
        }
    }
}
