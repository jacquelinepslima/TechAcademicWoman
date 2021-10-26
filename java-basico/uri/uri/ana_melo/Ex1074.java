package exercicio.uri.ana_melo;

import java.util.Scanner;

public class Ex1074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, valorLido;
        n = sc.nextInt();

        for (int i=0; i<n; i++){
            valorLido = sc.nextInt();
            if( valorLido == 0){
                System.out.println("NULL");
            } else if (valorLido%2==0){
                if(valorLido > 0){
                    System.out.println("EVEN POSITIVE");
                } else {
                    System.out.println("EVEN NEGATIVE");
                }
            } else {
                if(valorLido > 0){
                    System.out.println("ODD POSITIVE");
                } else {
                    System.out.println("ODD NEGATIVE");
                }
            }
        }

        sc.close();
    }
}
