package exercicio.uri.bruna_lima;
//
import java.util.Locale;
import java.util.Scanner;

public class Ex1009 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        String nome = entrada.next();
        double salarioFixo = entrada.nextDouble();
        double montante = entrada.nextDouble();

        double total = (0.15 * montante) + salarioFixo;

        System.out.printf("TOTAL = R$ %.2f%n", total);
        entrada.close();
    }
}
