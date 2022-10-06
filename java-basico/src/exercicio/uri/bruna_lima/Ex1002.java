package exercicio.uri.bruna_lima;

//import das bibliotecas
import java.util.Locale;
import java.util.Scanner;

public class Ex1002 {
    public static void main(String[] args) {
        // muda a padronizaçao do sistema numerico para o internacional - US
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in); //declaracao

        double pi = 3.14159;
        // entrada de dados - obs.: inserir número com vírgula
        double raio = entrada.nextDouble();
        /* se fosse com MATH
        double area = Math.PI * Math.pow(raio, 2);
         */
        double area = pi * raio * raio;

        // o PRINTF formata a saida - %4 limita as casas decimais
        System.out.printf("A=%.4f%n", area);
        entrada.close();
    }
}
