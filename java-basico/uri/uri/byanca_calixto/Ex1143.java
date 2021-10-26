package exercicio.uri.byanca_calixto;

import java.util.Scanner;

public class Ex1143 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [][] matriz = new int[N][4];

        for (int i = 1; i <= N; i++){ //linha
            for (int j = 1; j<=3; j++){//coluna
                System.out.print(i);
                for(j = 2; j <=3; j++){
                    System.out.print(" "+i*i);
                    for (j = 3; j <=3; j++){
                        System.out.print(" "+ i*i*i);
                    }
                }
            }
            System.out.println();
        }
        sc.close();
    }
}