package exercicio.resolvido.jacque_lima;

import java.util.Locale;
import java.util.Scanner;

public class Ex10 {
    /*
    Fazer um programa para ler o numero N, depois nome(apenas uma palavra
    sem espacos), idade e altura e N pessoas, conforme exemplo.
    Depois, mostrar na tela a altura e media das pessoas, e mostrar também a percentagem
    de pessoas com menos de 16 anos.
     */

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int tamanhoVetores = sc.nextInt();
        String[] listNomes = new String[tamanhoVetores];
        int[] idade = new int[tamanhoVetores];
        double[] alturas = new double[tamanhoVetores];

        for (int i = 0; i < tamanhoVetores; i++) {
            listNomes[i] = sc.next();
            idade[i] = sc.nextInt();
            alturas[i] = sc.nextDouble();
        }

        double soma = 0.0;
        for (int i = 0; i < tamanhoVetores; i++) {
            soma += alturas[i];
        }

        double media = soma / tamanhoVetores;
        System.out.printf("Media de altura %.2fn", media);

        int contadorPessoasMenos16 = 0;
        for (int i = 0; i < tamanhoVetores; i++) {
            if (idade[i] < 16) {
                contadorPessoasMenos16++;
                //
            }
        }
        double porcentagemPessoas = (double) contadorPessoasMenos16 * 100 / tamanhoVetores;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcentagemPessoas);

        sc.close();
    }
}