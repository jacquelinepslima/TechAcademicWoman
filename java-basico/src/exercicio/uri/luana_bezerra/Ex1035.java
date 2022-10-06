package exercicio.uri.luana_bezerra;

import java.util.Scanner;

public class Ex1035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt(), D = sc.nextInt();

        if ((B > C && D > A) && ((C + D) > (A + B)) && (C > 0 && D > 0) && (A % 2 == 0)) {
            System.out.println("Valores Aceitos");
        } else
            System.out.println("Valores não aceitos");

        sc.close();
    }
}
