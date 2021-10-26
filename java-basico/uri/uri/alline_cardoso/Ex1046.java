package exercicio.uri.alline_cardoso;

import java.util.Scanner;

public class Ex1046 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hinicial = scan.nextInt();
        int hfinal = scan.nextInt();
        int total;

        total = hfinal - hinicial;

        if (total<=0){
            total+=24;
        }
        System.out.println("O JOGO DUROU " + total + " HORA(S)");

        scan.close();

    }
    }



