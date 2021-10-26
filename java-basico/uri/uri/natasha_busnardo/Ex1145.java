package exercicio.uri.natasha_busnardo;

import java.util.Scanner;

public class Ex1145 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();

        for(int i=1; i<=y; i++){
                System.out.printf("%d ", i);

                if(i % x == 0){
                    System.out.println("");
                }
            }
        }


    }


