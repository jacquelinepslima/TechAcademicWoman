package exercicio.uri.byanca_calixto;

import java.util.Scanner;

public class Ex1094 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int N = sc.nextInt(); //quantidade de experimentos
        int qtCoelho = 0;
        int qtRato = 0;
        int qtSapo = 0;
        String tipo_cobaia = "";

        int quantia = 0; // so pode ser ter 15 cobaias do mesmo tipo (coelho, rato, ou sapo)
        int total_cobaias = 0;

        for(int i = 0; i < N; i++){
            quantia = sc.nextInt();
            tipo_cobaia= sc.next();
            if (tipo_cobaia.equalsIgnoreCase("C")){
                qtCoelho += quantia;
            }

            else if(tipo_cobaia.equalsIgnoreCase("R")) {
                qtRato += quantia;
            }

            else{
                qtSapo += quantia;
            }

        }
        total_cobaias=qtCoelho+qtRato+qtSapo;

        //consertar o calculo pois a saida ainda esta errada 
        double percentCoelho = (double) (qtCoelho*100)/total_cobaias;
        double percentRato = (double) (qtRato*100)/total_cobaias;
        double percentSapo = (double)(qtSapo*100)/total_cobaias;

        System.out.println("Total: "+ total_cobaias);
        System.out.println("Total de coelhos: "+qtCoelho);
        System.out.println("Total de ratos: "+qtRato);
        System.out.println("Total de sapos: "+qtSapo);
        System.out.printf("Percentual de coelhos: %2.f%n"+ percentCoelho + " %");
        System.out.printf("Percentual de ratos: %2.f%n"+ percentRato + " %" );
        System.out.printf("Percentual de sapos: %2.f%n"+ percentSapo+ " %");


        sc.close();
    }
}
