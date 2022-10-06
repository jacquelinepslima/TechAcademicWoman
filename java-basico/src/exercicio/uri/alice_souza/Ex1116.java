package exercicio.uri.alice_souza;

import java.util.Locale;
import java.util.Scanner;

public class Ex1116 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        int pares = scan.nextInt();
        int A, B;

        for(int i=0; i<pares; i++){
           A = scan.nextInt();
           B = scan.nextInt();
           if (B==0){
               System.out.println("divisao impossivel");
           }else{
           double resultado = (double) A/B;
               System.out.printf("%.1f%n",resultado);
           }
        }
        scan.close();
    }
}
