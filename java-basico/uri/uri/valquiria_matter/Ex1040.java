package exercicio.uri.valquiria_matter;


import java.util.Locale;
import java.util.Scanner;

    public class Ex1040 {
        public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            float n1,n2,n3,n4,media,notaexame;
            Scanner sc = new Scanner(System.in);
            n1=sc.nextFloat();
            n2=sc.nextFloat();
            n3=sc.nextFloat();
            n4=sc.nextFloat();
            media=((n1*2)+(n2*3)+(n3*4)+n4)/10;

            if (media>=7.0){
                System.out.printf("Media: %.1f%n",media);
                System.out.printf("Aluno aprovado.%n");
            }else if(media>=5.0 && media<=6.9){
                System.out.printf("Media: %.1f%n",media);
                System.out.printf("Aluno em exame.%n");
                notaexame=sc.nextFloat();
                media=(media+notaexame)/2;
                if(media>=5.0){
                    System.out.printf("Nota do exame: %.1f%n",notaexame);
                    System.out.printf("Aluno aprovado.%n");
                    System.out.printf("Media final: %.1f%n",media);
                }else if(media<=4.9){
                    System.out.printf("Nota do exame: %.1f%n",notaexame);
                    System.out.printf("Aluno reprovado.%n");
                    System.out.printf("Media final: %.1f%n",media);
                }
            }else if (media<5.0){
                System.out.printf("Media: %.1f%n",media);
                System.out.printf("Aluno reprovado.%n");
            }
            sc.close();
        }

    }

