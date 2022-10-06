package exercicio.uri.ana_caroline;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1080 {

    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);

        ArrayList x = new ArrayList ();
        int maiorNum = 0;
        int posicao = 0;

        for (int i = 0; i < 100; i++){

            int a = sc.nextInt();
            x.add(a);


        }

        for (int i = 0; i < x.size(); i++){

            int y = (int) x.get(i); //pegando o numero no array
            int z = (int) x.indexOf(y);
            if(y > maiorNum){

                maiorNum = y;
                posicao = z;

            }
        }

        System.out.println("Menor numero: " + maiorNum);
        System.out.println("Posicao: " + posicao);

        sc.close();
    }

}
