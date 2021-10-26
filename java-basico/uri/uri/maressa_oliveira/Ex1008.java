package exercicio.uri.maressa_oliveira;

import java.util.Locale;
import java.util.Scanner;

public class Ex1008 {
    public static void main(String[] args) {
        int num, ht;
        double vh,salario;
        String nome;
        Locale.setDefault(Locale.US);
        Scanner trabalho = new Scanner(System.in);
        num= trabalho.nextInt();
        ht= trabalho.nextInt();
        vh=trabalho.nextDouble();
        salario=ht*vh;
        System.out.printf("NUMBER = %d%n",num);
        System.out.printf("SALARY = U$ %.2f%n",salario);
        trabalho.close();

    }
}
