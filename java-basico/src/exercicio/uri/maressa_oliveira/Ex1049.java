package exercicio.uri.maressa_oliveira;

import java.util.Scanner;

public class Ex1049 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String palavra1 = scan.next();
        String palavra2 = scan.next();
        String palavra3 = scan.next();

        if(palavra1.equals("vertebrado")){
            if(palavra2.equals("ave")){
                if (palavra3.equals("carnivoro")){
                    System.out.println("aguia");
                }else if (palavra3.equals("onivoro")){
                    System.out.println("pomba");
                }
            }else if (palavra2.equals("mamifero")){
                if (palavra3.equals("onivoro")){
                    System.out.println("homem");
                }else if(palavra3.equals("herbivoro")){
                    System.out.println("vaca");
                }
            }
        }

        if(palavra1.equals("invertebrado")){
            if(palavra2.equals("inseto")){
                if (palavra3.equals("hematofago")){
                    System.out.println("pulga");
                }else if (palavra3.equals("herbivoro")){
                    System.out.println("lagarta");
                }
            }else if (palavra2.equals("anelideo")){
                if (palavra3.equals("hematofago")){
                    System.out.println("sanguessuga");
                }else if(palavra3.equals("onivoro")){
                    System.out.println("minhoca");
                }
            }
        }


    }


}
