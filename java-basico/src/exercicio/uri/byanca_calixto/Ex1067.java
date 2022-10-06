package exercicio.uri.byanca_calixto;

import java.util.Scanner;

public class Ex1067 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int i = 1; num>=i; i++){
            if (num%2!=0) {
                System.out.println(i);
                i++;
            }

        }

    }

}

