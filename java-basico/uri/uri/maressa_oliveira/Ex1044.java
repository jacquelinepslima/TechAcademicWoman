package exercicio.uri.maressa_oliveira;

import java.util.Scanner;

public class Ex1044 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        if ((a % b == 0) || (b % a == 0)) {
            System.out.println("São multiplos");
        }else{
            System.out.println("Não são múltiplos");
        }
    }
}
