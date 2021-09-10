package exercicio.uri.jacque_lima;

import java.util.Locale;
import java.util.Scanner;

public class Ex1040 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        float n1 = sc.nextFloat();
        float n2 = sc.nextFloat();
        float n3 = sc.nextFloat();
        float n4 = sc.nextFloat();

        float media = (n1 * 2 + n2 * 3 + n3 * 2 + n4 * 1) / 10;
        System.out.printf("Media: %.1f", media);

        if(media <= 7.0){
            System.out.printf("Aluno aprovado %n");
        }else if(media < 5.0){
            System.out.printf("Aluno reprovado %n");
        }else if(media >= 5.0 && media <= 6.9){
            System.out.printf("Aluno em exame %n");
        }

        float notaExame = sc.nextFloat();
        float mediaExame = (notaExame + media) / 2;
        System.out.printf("Nota do exame: %.1f%n", mediaExame);

        if(mediaExame >= 5.0){
            System.out.printf("Aluno aprovado %n");
        }else{
            System.out.printf("Aluno reprovado");
        }

        sc.close();
    }
}
