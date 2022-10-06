package exercicio.uri.amanda_medeiros;

import java.util.Scanner;

public class Ex1036 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double algumacoisa = (b * b) + (-4 * a * c);

        double delta = Math.sqrt(algumacoisa);
        double respostaUm = (-b + delta) / (2 * a);
        double respostaDois = (-b - delta) / (2 * a);

        if (a <= 0 || b <= 0 || c <= 0 || algumacoisa < 0){
            System.out.println("Impossível calcular");
        }

        else{

            System.out.printf("R1 = %.5f", respostaUm);
            System.out.printf("%n");
            System.out.printf("R2 = %.5f", respostaDois);

        }

    }
}
