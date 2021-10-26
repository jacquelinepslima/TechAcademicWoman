package exercicio.resolvido.jacque_lima;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
/*
        Algoritmo que lê N números inteiros e armazenar em vetor
        mostrar os valores negativos
         */

        Scanner scanner = new Scanner(System.in);
        int tamanhoVetor = scanner.nextInt();
        int[] listaNumeros = new int[tamanhoVetor];

        for (int i = 0; i < tamanhoVetor; i++) {
            listaNumeros[i] = scanner.nextInt();
        }

        for (int i = 0; i < tamanhoVetor; i++) {
            if (listaNumeros[i] < 0) {
                System.out.println(listaNumeros[i] + " ");
            }
        }
        scanner.close();
    }
}