package exercicio.uri.maressa_oliveira;
import java.io.IOException;
import java.util.Scanner;


public class Ex1001 {
    public static void main(String[] args) throws IOException {
        int A,B,X;
        Scanner insere = new Scanner(System.in);
        A=insere.nextInt();
        B=insere.nextInt();
        insere.close();
        X=A+B;
        System.out.println("X = "+X);
    }
}