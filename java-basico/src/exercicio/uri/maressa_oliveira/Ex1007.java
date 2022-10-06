package exercicio.uri.maressa_oliveira;

import java.util.Scanner;

public class Ex1007 {
    public static void main(String[] args) {
        int A,B,C,D, DIFERENCA;
        Scanner fomento = new Scanner(System.in);
        A=fomento.nextInt();
        B=fomento.nextInt();
        C=fomento.nextInt();
        D=fomento.nextInt();
        DIFERENCA=(A*B-C*D);
        System.out.println("DIFERENCA = "+DIFERENCA);
        fomento.close();
    }
}
