package exercicio.revisao;


import jdk.swing.interop.SwingInterOpUtils;

import java.util.Locale;
import java.util.Scanner;

/*
Leia 3 valores de ponto flutuante A, B e C e ordene-os em ordem decrescente, de modo que o lado A representa o maior dos
 3 lados. A seguir, determine o tipo de triângulo que estes três lados formam, com base nos seguintes casos, sempre
 escrevendo uma mensagem adequada:
se A ≥ B+C, apresente a mensagem: NAO FORMA TRIANGULO
se A2 = B2 + C2, apresente a mensagem: TRIANGULO RETANGULO
se A2 > B2 + C2, apresente a mensagem: TRIANGULO OBTUSANGULO
se A2 < B2 + C2, apresente a mensagem: TRIANGULO ACUTANGULO
se os três lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO
se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO ISOSCELES
 */
public class Uri_1045_revisao_24_09 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double l1 = scan.nextDouble();
        double l2 = scan.nextDouble();
        double l3 = scan.nextDouble();

        double A, B, C;

        double max1 = Math.max(l1, l2);
        A = Math.max(max1, l3 );
         if (l1==A){
             B= l2;
             C= l3;
         } else if (l2==A){
             B= l1;
             C=l3;
         } else{
             B=l1;
             C=l2;
         }
        if (A >= (B+C)){
            System.out.println("NÃO FORMA TRIÂNGULO");
        }else if (A * A == (B * B) + (C * C)){
            System.out.println("TRIÂNGULO RETÂNGULO");
        }else if (A * A > (B * B) + (C * C)){
            System.out.println("TRIÂNGULO OBTUSANGULO");
        } else if (A * A < (B * B) + (C * C)){
            System.out.println("TRIÂNGULO ACUTANGULO");
        }
        if((A == B) && (B == C)) {
            System.out.println("TRIANGULO EQUILATERO");
        }
        else if((A == B) || (B == C) || (C == A)) {
            System.out.println("TRIANGULO ISOSCELES");
        }



        scan.close();

    }
}
