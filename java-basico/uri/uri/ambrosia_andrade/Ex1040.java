package exercicio.uri.ambrosia_andrade;

import java.util.Locale;
import java.util.Scanner;

public class Ex1040 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        //peso 2,  3,  4,  1
        float N1, N2, N3, N4, media, notaExame;
        String mensagem = "";
        N1 = scanner.nextFloat();
        N2 = scanner.nextFloat();
        N3 = scanner.nextFloat();
        N4 = scanner.nextFloat();
        media = (((N1 * 2) + (N2 * 3) + (N3 * 4) + (N4 * 1))/10);

        mensagem = (media >= 7.0) ? "Aluno aprovado." : (media < 5.0) ? "Aluno reprovado." : "Aluno em exame.";

        System.out.printf("Media: %.1f%n", media);

        if(mensagem.equals("Aluno em exame.")){
            System.out.println("Aluno em exame.");
            notaExame = scanner.nextFloat();
            System.out.printf("Nota do exame: %.1f%n", notaExame);
            media = (media + notaExame) / 2;
            mensagem = (media >= 5.0) ? "Aluno aprovado." : "Aluno reprovado.";
            System.out.println(mensagem);
            System.out.printf("Media final: %.1f%n", media);
        } else {
            System.out.println(mensagem);
        }

        scanner.close();
    }
}
