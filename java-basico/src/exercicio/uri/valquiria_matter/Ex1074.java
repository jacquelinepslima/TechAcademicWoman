package exercicio.uri.valquiria_matter;

import java.util.Scanner;

public class Ex1074 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for(int i=0; i<n; i++){
            int numero = scan.nextInt();

            if(numero == 0){
                System.out.println("NULL");
            } else if(numero % 2==0){
                System.out.print("EVEN ");
            }else{
                System.out.print("ODD ");
            }

            if(numero < 0){
                System.out.printf("NEGATIVE %n");
            }else if (numero > 0){
                System.out.printf("POSITIVE %n");
            }

        }


    }

}
