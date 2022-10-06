package exercicio.uri.paula_santos;
import java.util.Locale;
import java.util.Scanner;
public class Ex1002 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do raio (duas casas decimais):");
        double raio = sc.nextDouble();

        double area = Math.PI * Math.pow(raio,2);

        System.out.printf("A= %.4f%n", area);

        sc.close();
    }
}
