package exercicio.uri.alline_cardoso;

import java.util.Scanner;

public class Ex1004 {
    public static void main(String[] args) {
        Scanner pd = new Scanner(System.in);

        int A = pd.nextInt();
        int B = pd.nextInt();

        int prod = A * B;

        System.out.printf("PROD = " + prod);
        System.out.println();


        pd.close();
    }
}
