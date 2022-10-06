package exercicio.uri.rebeca_lira;
import java.util.Scanner;

public class Ex1013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a= scanner.nextInt(), b=scanner.nextInt(), c=scanner.nextInt();
        int maiorAB = (a + b + Math.abs(a-b))/2;
        int maiorTotal = (maiorAB + c + Math.abs(maiorAB-c))/2;

        System.out.printf("%d eh o maior %n", maiorTotal);

        scanner.close();
    }
}
