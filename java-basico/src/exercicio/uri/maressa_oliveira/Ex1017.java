package exercicio.uri.maressa_oliveira;

import java.util.Locale;
import java.util.Scanner;

public class Ex1017 {
    public static void main(String[] args) {
        int tv,vm;
        double ql;
        Locale.setDefault(Locale.US);
        Scanner abastecer = new Scanner(System.in);
        tv=abastecer.nextInt();
        vm=abastecer.nextInt();
        ql=(vm*tv)/12.0;
        System.out.printf("%.3f%n",ql);
        abastecer.close();
    }
}
