package exercicio.uri.evelin_ferraz;
import java.util.Locale;
import java.util.Scanner;

public class Ex1002 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // double pi = Math.PI;    pacote matematico

        System.out.println("Insira o valor do raio: ");
        double raio = sc.nextDouble();

        double area = Math.PI * Math.pow(raio, 2); //math.pow pacote para potenciacao

        System.out.printf("A= %.4f", area);

        sc.close();
    }
}
