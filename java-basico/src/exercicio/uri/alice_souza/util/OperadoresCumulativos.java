package exercicio.uri.alice_souza.util;

import java.util.Locale;
import java.util.Scanner;

public class OperadoresCumulativos {
    /*
    Operadores Cumulativos

    a+= 10
    a-=
    a*=
    a/=
    a%=
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        int tempo = scan.nextInt();
        double franquia = 50.0;

        if(tempo>100){
        franquia += (tempo - 100)*2;
        }
        System.out.printf("O valor final da conta é de R$ %.2f", franquia);
    }
}
