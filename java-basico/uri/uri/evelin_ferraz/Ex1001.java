package exercicio.uri.evelin_ferraz;
import java.util.Scanner; //Importando a biblioteca Scanner;

public class Ex1001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       //DECLARAÇÃO DAS VARIÁVEIS
        int A;
        int B;

        //ENTRADA DE DADOS (SETANDO OS VALORES NAS VARIAVEIS) (LEIA);
        A = scanner.nextInt();
        B = scanner.nextInt();

        //EFETUANDO A SOMA
        int X = A + B;

        //PRINTANDO RESULTADO NA TELA
        System.out.println("X= " + X);

        scanner.close();
    }
}
