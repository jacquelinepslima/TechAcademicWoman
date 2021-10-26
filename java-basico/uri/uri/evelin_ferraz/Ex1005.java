package exercicio.uri.evelin_ferraz;
import java.util.Locale;
import java.util.Scanner;

public class Ex1005 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double notaA = sc.nextDouble() * 3.5 ;
        System.out.println("Digite a segunda nota: ");
        double notaB = sc.nextDouble() * 7.5 ;

        double media = (notaA + notaB) / 11;

        System.out.printf("MEDIA = %.5f", media);
        sc.close();
    }
}
