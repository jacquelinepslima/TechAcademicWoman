package exercicio.uri.inajara_pereira;
import java.util.Locale;
import java.util.Scanner;

public class Ex1009 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.next();

        System.out.println("Insira o seu salário fixo: R$");
        double salarioFixo = sc.nextDouble();

        System.out.println("Insira o valor total das vendas realizadas neste mês: ");
        double vendas = sc.nextDouble();

        double salarioTotal = (vendas * 0.15) + salarioFixo;

        System.out.printf("TOTAL = R$ %.2f", salarioTotal);

        sc.close();
    }
}
