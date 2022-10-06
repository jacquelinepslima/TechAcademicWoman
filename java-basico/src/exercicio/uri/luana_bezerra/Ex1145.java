package exercicio.uri.luana_bezerra;

import java.util.Scanner;

public class Ex1145 {
    public static void main(String[] args) {
        Scanner exercicio = new Scanner(System.in);

        int X = exercicio.nextInt();
        int Y = exercicio.nextInt();
        int n;
        int saida = 1;

        while(saida <= Y){

            if((X > 1) && (X < 20) && (Y > X) && (Y < 100000)){

                for(n = 0; n < X; n++){
                    System.out.print(saida);
                    if(n < X - 1){
                        System.out.print(" ");
                    }
                    saida++;
                }
                System.out.println();
            }
            exercicio.close();
        }
    }
}
