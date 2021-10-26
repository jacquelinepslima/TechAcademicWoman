package exercicio.uri.byanca_calixto;

import java.util.Scanner;

public class Ex1074 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("quantos numeros vc quer verificar? ");
        int qt = sc.nextInt();

        for (int i = 1; qt>=i; i++){
            double num = sc.nextDouble();
            if (num > 0){
                if (num%2==0){
                    System.out.println("EVEN POSITIVE");
                    }
                else{
                    System.out.println("ODD POSITIVE");
                }
            }
            else if (num<0){
                if(num%2==0){
                    System.out.println("EVEN NEGATIVE");

                }
                else {
                    System.out.println("ODD NEGATIVE");
                }
            }
            else {
                System.out.println("NULL");
            }
        }

        sc.close();
    }
}
