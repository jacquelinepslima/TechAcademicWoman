package exercicio.uri.evelin_ferraz;
import java.util.Locale;
import java.util.Scanner;

public class Ex1010 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o código da peça, a quantidade e o valor unitário: ");
        int cod = sc.nextInt();
        int qtd = sc.nextInt();
        double valor = sc.nextDouble();

        double valorTotal = qtd * valor;

        System.out.printf("VALOR A PAGAR: R$%.2f", valorTotal);
        sc.close();
    }
}
