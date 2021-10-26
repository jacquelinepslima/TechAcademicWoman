package exercicio.uri.amanda_alves;

import java.util.Scanner;

public class Ex1049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String definicao1 = sc.nextLine();
        String definicao2 = sc.nextLine();
        String definicao3 = sc.nextLine();

        if(definicao1.equals("vertebrado") && definicao2.equals("ave") && definicao3.equals("carnivoro")){
            System.out.println("aguia");
        }
        if (definicao1.equals("vertebrado") && definicao2.equals("ave") && definicao3.equals("onivoro")){
            System.out.println("pomba");
        }
        if (definicao1.equals("vertebrado") && definicao2.equals("mamifero") && definicao3.equals("onivoro")){
            System.out.println("homem");
        }
        if (definicao1.equals("vertebrado") && definicao2.equals("mamifero") && definicao3.equals("herbivoro")){
            System.out.println("vaca");
        }
        if (definicao1.equals("invertebrado") && definicao2.equals("inseto") && definicao3.equals("hematofago")){
            System.out.println("pulga");
        }
        if (definicao1.equals("invertebrado") && definicao2.equals("inseto") && definicao3.equals("herbivoro")){
            System.out.println("lagarta");
        }
        if (definicao1.equals("invertebrado") && definicao2.equals("anelideo") && definicao3.equals("hematofago")){
            System.out.println("sanguessuga");
        }
        if (definicao1.equals("invertebrado") && definicao2.equals("anelideo") && definicao3.equals("onivoro")){
            System.out.println("minhoca");
        }


        sc.close();
    }

}
