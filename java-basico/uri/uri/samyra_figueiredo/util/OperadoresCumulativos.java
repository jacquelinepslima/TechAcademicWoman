package exercicio.uri.samyra_figueiredo.util;

import java.util.Locale;
import java.util.Scanner;

public class OperadoresCumulativos {

    /*
        a = 5;

        a = a + 10; --> 15

        a = 5;

        a += 10; --> 15 // incremnetar                              a = a + b;
        a -= 10; --> -5 // decrementar                              a = a - b;
        a *= 10;        // incrementa com a multiplicacao           a = a * b;
        a /= 10;        // incrementa com a divisao                 a = a / b;
        a %= 10;        // incrementar com MOD                      a = a % b;
    */
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int min = sc.nextInt();

        double conta = 50.0;

        if (min > 100) {
            conta += (min - 100) * 2.0;
        }

        System.out.printf("Valor final da conta R$ %.2f", conta);

        sc.close();

    }
}
