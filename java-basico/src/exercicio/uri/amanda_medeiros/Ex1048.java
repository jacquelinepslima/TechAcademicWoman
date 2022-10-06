package exercicio.uri.amanda_medeiros;
import java.util.Locale;
import java.util.Scanner;

public class Ex1048 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int perc;
        double salario, aumento, total;
        salario = scanner.nextDouble();

        if (salario >= 0 && salario <= 400.00){
            aumento = salario * 0.15;
            total = salario + aumento;
            perc = 15;

        } else if (salario >= 401.00 && salario <= 800.00){
            aumento = salario * 0.12;
            total = salario + aumento;
            perc = 12;
        } else if (salario >= 800.01 && salario <= 1200.00){
            aumento = salario * 0.10;
            total = salario + aumento;
            perc = 10;
        } else if (salario >= 1200.01 && salario <= 2000.00){
            aumento = salario * 0.07;
            total = salario + aumento;
            perc = 7;
        } else {
            aumento = salario * 0.04;
            total = salario + aumento;
            perc = 4;
        }

        System.out.printf("Novo Salário: R$ %.2f%n", total);
        System.out.printf("Reajuste ganho: R$ %.2f%n", aumento);
        System.out.printf("Em percentual: %d %%", perc);
        scanner.close();
    }
}
