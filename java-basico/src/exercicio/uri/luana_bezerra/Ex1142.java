package exercicio.uri.luana_bezerra;

import java.util.Scanner;

public class Ex1142 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int fim = n * 4;

        for(int i = 1; i <= fim; i++){

            if(i % 4 == 0){
                System.out.println("PUM");

            } else if (i % 4 != 0) {
                System.out.print(i + " ");


            }


        }
        sc.close();
    }
}
