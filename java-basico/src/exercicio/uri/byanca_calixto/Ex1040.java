package exercicio.uri.byanca_calixto;

import java.util.Locale;
import java.util.Scanner;

public class Ex1040 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        float N1 = sc.nextFloat(); //2
        float N2 = sc.nextFloat(); //3
        float N3 = sc.nextFloat(); //4
        float N4 = sc.nextFloat(); //1

        String statusAluno = "";

        float media = ((N1*2)+(N2*3)+(N3*4)+N4)/10;

        if (media >= 7.0){
            System.out.println("Aluno aprovado");
            System.out.printf("Media: %.1f", media);
        }

        else if (media>= 5.0 && media < 7){
            System.out.printf("Media: %.1f%n", media);
            System.out.println("Aluno em exame");

            System.out.println("Nota do exame: ");
            float notaExame = sc.nextFloat();
                float mediaNova = (media+notaExame)/2;
                if (mediaNova >=5){
                    System.out.println("Aluno aprovado");
                }
                else{
                    System.out.println("Aluno reprovado");
                }
                System.out.printf("Média final: %.1f", mediaNova);

        }
        else {
            System.out.println("Aluno reprovado");

        }

        sc.close();
    }

}
