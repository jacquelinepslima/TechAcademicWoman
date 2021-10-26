package exercicio.uri.alice_souza;

import java.util.Scanner;

public class Ex1080 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ordem=0, numero;
        int maior =0;
        for (int i = 1; i<=100; i++){
            numero = scan.nextInt();
            if (numero > maior){
                maior = numero;
                ordem = i;
            }
        }
        System.out.println(maior);
        System.out.println(ordem);
        scan.close();
    }

}
