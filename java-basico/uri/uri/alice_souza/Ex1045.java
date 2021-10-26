package exercicio.uri.alice_souza;

import java.util.Locale;
import java.util.Scanner;

public class Ex1045 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        double L1 = scan.nextDouble();
        double L2 = scan.nextDouble();
        double L3= scan.nextDouble();
        double B, C;
        double maior12 = Math.max(L1,L2);
        double A = Math.max(maior12, L3);
        if (A==L1){
            B = L2;
            C = L3;
        }else if (A==L2) {
            B = L1;
            C = L3;
        }else {
            B = L1;
            C = L2;
        }
        if(A>=(B+C)){
            System.out.println("NAO FORMA TRIANGUL0");
        } else {
            if ((A * A) == ((B * B) + (C * C))) {
                System.out.println("TRIANGUL0 RETANGULO");
            } if ((A * A) > ((B * B) + (C * C))) {
                System.out.println("TRIANGUL0 OBTUSANGULO");
            } if ((A * A) < ((B * B) + (C * C))) {
                System.out.println("TRIANGUL0 ACUTANGULO");
            } if ((A == B) || (B == C) || (A == C)) {
                if ((A == B) && (B == C)) {
                    System.out.println("TRIANGUL0 EQUILATERO");
                } else {
                    System.out.println("TRIANGUL0 ISOCELES");
                }
            }
        }

        scan.close();
    }
}
