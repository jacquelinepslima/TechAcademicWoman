package exercicio.uri.evelin_ferraz;
import java.util.Locale;
import java.util.Scanner;

public class Ex1014 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a distância percorrida em Km: ");
        int km = sc.nextInt();
        System.out.println("Qual o valor gasto em combustível: R$");
        double valor = sc.nextDouble();

        double vlrFinal = km / valor;

        System.out.printf("%.3f Km/l", vlrFinal);

        sc.close();
    }
}
