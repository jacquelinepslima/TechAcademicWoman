package exercicio.uri.bruna_lima;
import java.util.Locale;
import java.util.Scanner;

public class Ex1040 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        float N1,N2,N3,N4,media;
        Scanner sc=new Scanner(System.in);
        N1=sc.nextFloat();
        N2=sc.nextFloat();
        N3=sc.nextFloat();
        N4=sc.nextFloat();
        media=(N1*2+N2*3+N3*4+N4)/10;
        System.out.printf("Media: %.1f%n",media);
        if(media>=7.0){
            System.out.println("Aluno aprovado.");
        }
        else if((media>=5.0)&&(media<=6.9)){
            System.out.println("Aluno em exame.");
            N1=sc.nextFloat();
            media=(media+N1)/2;
            if(media>=5.0){
                System.out.printf("Nota do exame: %.1f%n",N1);
                System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f%n",media);
            }
            else {
                System.out.println("Aluno reprovado.");
            }
        }
        else{
            System.out.println("Aluno reprovado.");
        }
        sc.close();
    }
}
