package exercicio.uri.luana_bezerra;

import java.util.Scanner;

public class Ex1049 {
    public static void main(String[] args) {
        Scanner animal = new Scanner(System.in);

        String tipo = animal.next();

        if(tipo.equals("vertebrado")){
            Scanner especie = new Scanner(System.in);
            String especie1 = especie.next();

            if(especie1.equals("ave")){
                Scanner aliment10 = new Scanner(System.in);
                String aliment1 = aliment10.next();

                if(aliment1.equals("carnivoro")){
                    System.out.println("aguia");
                }

                else if(aliment1.equals("onivoro")){
                    System.out.println("pomba");
                }

                aliment10.close();
            }

            if(especie1.equals("mamifero")) {
                Scanner aliment20 = new Scanner(System.in);
                String aliment2 = aliment20.next();

                if (aliment2.equals("onivoro")) {
                    System.out.println("homem");
                }

                else if(aliment2.equals("herbivoro")) {
                    System.out.println("vaca");
                }

                aliment20.close();
            }

            especie.close();
        }
        if(tipo.equals("invertebrado")){
            Scanner especie20 = new Scanner(System.in);
            String especie2 = especie20.next();

            if(especie2.equals("inseto")){
                Scanner aliment30 = new Scanner(System.in);
                String aliment3 = aliment30.next();

                if(aliment3.equals("hematofago")){
                    System.out.println("pulga");
                }

                else if(aliment3.equals("herbivoro")){
                    System.out.println("lagarta");
                }

                aliment30.close();
            }

            if(especie2.equals("anelideo")) {
                Scanner aliment40 = new Scanner(System.in);
                String aliment4 = aliment40.next();

                if (aliment4.equals("hematofago")) {
                    System.out.println("sanguessuga");
                }

                else if(aliment4.equals("onivoro")) {
                    System.out.println("minhoca");
                }

                aliment40.close();
            }

            especie20.close();
        }


        animal.close();
    }
}
