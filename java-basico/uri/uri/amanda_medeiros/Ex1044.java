package exercicio.uri.amanda_medeiros;
import java.util.Scanner;

public class Ex1044 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int A, B;

        A = scanner.nextInt();
        B = scanner.nextInt();

        if(A % B == 0 || B % A == 0){
            System.out.println("São Multiplos");
        } else {
            System.out.println("Não são Multiplos ");
        }

        scanner.close();
    }
}
