package exercicio.uri.byanca_calixto;

import java.util.Scanner;

public class Ex1116 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de pares");
        int N = sc.nextInt();

        for (int i = 1; i<=N; i++ ){
            System.out.println("digite n1 e n2 para dividir");
            int X = sc.nextInt();
            int Y = sc.nextInt();
            double divisao =  (double) X/Y;

            if (Y==0){
                System.out.println("impossivel calcular");
            }
            else if (divisao!= 0){
                System.out.printf("%.1f%n",divisao);
            }
            else {
                System.out.println(0.0);
            }
        }

    }
}
