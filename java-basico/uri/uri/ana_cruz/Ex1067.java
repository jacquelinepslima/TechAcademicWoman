package exercicio.uri.ana_cruz;

import java.util.Scanner;

public class Ex1067 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int X = scan.nextInt();
        scan.close();
        int i =1;
        while(i<=X){
            System.out.println(i);
            i= i+2;
        }
    }
}
