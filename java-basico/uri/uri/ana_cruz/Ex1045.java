package exercicio.uri.ana_cruz;

import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class Ex1045 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        float A, B, C;
        double  calcA, calcD;
        String mensagem = "";

        A = scanner.nextFloat();
        B = scanner.nextFloat();
        C = scanner.nextFloat();

        Float[] array = {A, B, C};
        Arrays.sort(array, Collections.reverseOrder());

        calcA = Math.pow(array[0], 2);
        calcD = Math.pow(array[1], 2) + Math.pow(array[2], 2);

        if(array[0] >= (array[1] + array[2])){
            mensagem = "NAO FORMA TRIANGULO";
        } else if (calcA == calcD){
            mensagem = "TRIANGULO RETANGULO";
        } else if (calcA > calcD) {
            mensagem = "TRIANGULO OBTUSANGULO";
        } else if (calcA < calcD) {
            mensagem = "TRIANGULO ACUTANGULO";
        }

        System.out.println(mensagem);

        if (((A == B) && (B != C)) ||
                ((A == C) && (A != B))) {
            System.out.println("TRIANGULO ISOSCELES");
        }

        if ((A == B) && (B == C) && (A == C)) {
            System.out.println("TRIANGULO EQUILATERO");
        }

        scanner.close();
    }
}
