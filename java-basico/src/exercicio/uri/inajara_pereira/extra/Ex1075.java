package exercicio.uri.inajara_pereira.extra;

import java.util.Scanner;

public class Ex1075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i=1; i <= 1000; i++){
            if (i % N == 2){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
