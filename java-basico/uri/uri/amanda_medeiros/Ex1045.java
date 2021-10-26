package exercicio.uri.amanda_medeiros;

import java.util.Scanner;

public class Ex1045 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double primeiro = scanner.nextDouble();
        double segundo = scanner.nextDouble();
        double terceiro = scanner.nextDouble();
        double A = 0;
        double B = 0;
        double C = 0;

        if (primeiro >= segundo && primeiro >= terceiro){
            A = primeiro;
            B = segundo;
            C = terceiro;
        }
        else if(segundo >= primeiro && segundo >= terceiro){
            A = segundo;
            B = primeiro;
            C = terceiro;
        }
        else if(terceiro >= primeiro && terceiro >= segundo){
            A = terceiro;
            B = primeiro;
            C = segundo;
        }

        if (A >= (B + C)){
            System.out.println("NAO FORMA TRIANGULO");
        }
        else if(A * A == (B * B) + (C * C)){
            System.out.println("TRIANGULO RETANGULO");
        }
        else if(A * A > (B * B) + (C * C)){
            System.out.println("TRIANGULO OBTUSANGULO");
        }
        else if(A * A < (B * B) + (C * C)){
            System.out.println("TRIANGULO ACUTANGULO");
        }

        if(primeiro == segundo && primeiro == terceiro){
            System.out.println("TRIANGULO EQUILATERO");
        }
        if(primeiro == segundo && primeiro != terceiro || primeiro == terceiro && primeiro != segundo || segundo == terceiro && segundo != primeiro){
            System.out.println("TRIANGULO ISOSCELES");
        }

        scanner.close();

    }
}
