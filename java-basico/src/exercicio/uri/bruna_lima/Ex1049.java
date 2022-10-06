package exercicio.uri.bruna_lima;

import java.util.Scanner;

public class Ex1049 {
    public static void main(String[] args) {
        String ossos,familia,alimentacao;
        Scanner sc=new Scanner(System.in);
        ossos=sc.next();
        familia=sc.next();
        alimentacao=sc.next();
        if(ossos.equals("vertebrado")){
            if(familia.equals("ave")){
                if(alimentacao.equals("carnivoro")){
                    System.out.println("aguia");
                }
                else{
                    System.out.println("pomba");
                }
            }
            else{
                if(alimentacao.equals("onivoro")){
                    System.out.println("homem");
                }
                else{
                    System.out.println("vaca");
                }
            }
        }
        else if(ossos.equals("invertebrado")){
            if(familia.equals("inseto")){
                if(alimentacao.equals("hematofago")){
                    System.out.println("pulga");
                }
                else {
                    System.out.println("lagarta");
                }
            }
            else{
                if(alimentacao.equals("hematofago")){
                    System.out.println("sanguessuga");
                }
                else {
                    System.out.println("minhoca");
                }
            }
        }


        sc.close();
    }
}
