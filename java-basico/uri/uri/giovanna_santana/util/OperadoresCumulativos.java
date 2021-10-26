package exercicio.uri.giovanna_santana.util;

import java.util.Locale;
import java.util.Scanner;

public class OperadoresCumulativos {

    /* Operadores cumulativos

        a += 10     => 15 // incrementar                    a = a + b
        a -= 10     => 15 // descrementar                   a = a - b
        a *= 10     => 15 // incrementar com mutiplicacao   a = a * b
        a /= 10     => 15 // incrmentar com divisao         a = a / b
        a %= 10     => 15 // incrementar com MOD            a = a & b

     */

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int minutosUtilizados = sc.nextInt();

        double franquia = 50.0;
        if (minutosUtilizados > 100){
            franquia += (minutosUtilizados - 100) * 2.0;
        }

        System.out.printf("Valor final da conta R$ %.2f", franquia);

        sc.close();
    }
}
