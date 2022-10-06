package exercicio.uri.natasha_busnardo;

import java.util.Scanner;

public class Ex1101 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int maior, menor;
        int m, n;
        int soma = 0;

        m = scan.nextInt();
        n = scan.nextInt();

        while ((m > 0) && (n > 0)){
            if(m > n){
                maior = m;
                menor = n;
            }else{
                maior = n;
                menor = m;
            }

            for(int j=menor; j<=maior; j++){
                System.out.printf("%d ", j);
                soma += j;
            }

            System.out.printf( "Sum=%d %n",soma);

            soma = 0;

            m = scan.nextInt();
            n = scan.nextInt();

        }





        }

    }


