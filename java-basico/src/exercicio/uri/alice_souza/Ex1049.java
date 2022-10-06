package exercicio.uri.alice_souza;

import java.util.Scanner;

public class Ex1049 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a, b, c;

        a = sc.nextLine();
        b = sc.nextLine();
        c = sc.nextLine();

        if (a.equals("vertebrado") && b.equals("ave") && c.equals("carnivoro")) {
            System.out.println("aguia");
        } else if (a.equals("vertebrado") && b.equals("ave") && c.equals("onivoro")) {
            System.out.println("pomba");
        } else if (a.equals("vertebrado") && b.equals("mamifero") && c.equals("onivoro")) {
            System.out.println("homem");
        } else if (a.equals("vertebrado") && b.equals("mamifero") && c.equals("herbivoro")) {
            System.out.println("vaca");
        } else if (a.equals("invertebardo") && b.equals("inseto") && c.equals("hematogafo")) {
            System.out.println("pulga");
        } else if (a.equals("invertebardo") && b.equals("inseto") && c.equals("herbivoro")) {
            System.out.println("lagarta");
        } else if (a.equals("invertebardo") && b.equals("anelideo") && c.equals("hematogafo")) {
            System.out.println("sanguessuga");
        } else if (a.equals("invertebardo") && b.equals("anelideo") && c.equals("onivoro")) {
            System.out.println("minhoca");
        } else {
            System.out.println("opção invalida");
        }

        sc.close();
    }
}
