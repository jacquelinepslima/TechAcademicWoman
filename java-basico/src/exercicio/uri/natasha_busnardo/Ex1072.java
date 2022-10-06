package exercicio.uri.natasha_busnardo;

import java.util.Scanner;

public class Ex1072 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numeroVezes = scan.nextInt();

        int in = 0, out = 0;

        for(int i=1; i<=numeroVezes; i++){
            int num = scan.nextInt();

            if(num >= 10 && num <=20){
                in++;
            }else{
                out++;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");





    }
}
