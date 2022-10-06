package exercicio.uri.maressa_oliveira;

import java.util.Locale;
import java.util.Scanner;

public class Ex1010 {
    public static void main(String[] args) {
        int cod1,cod2,np1,np2;
        double vu1, vu2, valor;
        Locale.setDefault(Locale.US);
        Scanner setando = new Scanner(System.in);
        cod1=setando.nextInt();
        np1= setando.nextInt();
        vu1= setando.nextDouble();
        cod2=setando.nextInt();
        np2=setando.nextInt();
        vu2=setando.nextDouble();
        valor=(np1*vu1)+(np2*vu2);
        System.out.printf("VALOR A PAGAR: R$ %.2f%n",valor);
        setando.close();
    }
}
