package exercicio.uri.rebeca_lira.util;

import java.util.Locale;
import java.util.Scanner;

public class OperadoresCumulativos {

    /* Operadores cumulativos
    a = a + outrovalor

    exemplo:
    a=5;

    a += 10 => 15; // incrementar   equivale a: a = a + 10 = 15
    a -= 10 => -5; // decrementar   equivale a: a = a - 10 = -5
    a *= 10 => 50; // incrementar com multiplicação equivale a: a = a * 10 = 50
    a /= 10 => 0.5; // incrementar com divisão  equivale a: a = a / 10 = 0.5
    a %= 10 => 0; // incrementar com MOD equivale a: a = a % 10 = 0

     */

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double minutosUsados = scanner.nextDouble();
        double conta = 50.0;

        if (minutosUsados > 100) {
            conta += (minutosUsados - 100)*2.0;
        }

        System.out.printf("Valor final da conta: R$%.2f", conta);

        scanner.close();
    }
}
