package exercicio.uri.ana_cruz;

import java.util.Scanner;

public class Ex1153 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int fatorial = 1;
        for (int i = N; i > 1; i--){
            fatorial = fatorial*i;
        }
        System.out.println(fatorial);
        scan.close();
    }
}
