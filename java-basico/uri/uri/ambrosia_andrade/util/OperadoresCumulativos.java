package exercicio.uri.ambrosia_andrade.util;

import java.util.Locale;
import java.util.Scanner;

public class OperadoresCumulativos {
    /*  Operadores cumulativos

        a += 10    => 15 // incrementar                     a = a + b
        a -= 10    => 15 // descrementar                    a = a - b
        a *= 10    => 15 // incrementa com multiplicacao    a = a * b
        a /= 10    => 15 // incrementa com divisao          a = a / b
        a %= 10    => 15 // incrementa com MOD              a = a % b
     */

    /*
    Uma operadora de telefonia cobra R$ 50.00 por um plano básico que
    dá direito a 100 minutos de telefone. Cada minuto que exceder a
    franquia de 100 minutos custa R$ 2.00. Fazer um programa para ler a
    quantidade de minutos que uma pessoa consumiu, daí mostrar o valor
    a ser pago.
     */
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int minutoUtilizados = scanner.nextInt();

        double franquia = 50.0;
        if (minutoUtilizados > 100) {
            franquia += (minutoUtilizados - 100) * 2.0;
        }

        System.out.printf("Valor final da conta R$ %.2f", franquia);

        scanner.close();
    }
}
