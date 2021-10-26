package exercicio.resolvido.jacque_lima;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade = sc.nextInt();
        int contadorDeRepeticao = 0;
        int somaIdade = 0;


        while (idade >= 0 ){
            contadorDeRepeticao++;
            somaIdade = somaIdade + idade;
            System.out.println("Digite novamente a idade");
            idade = sc.nextInt();

        }

        if(contadorDeRepeticao > 0){
            double mediaIdades = (double)somaIdade / contadorDeRepeticao;
            System.out.printf("Media das idades %.2f%n", mediaIdades);
        }else{
            System.out.println("Impossível Calcular");
        }

        // System.out.println("Vezes contador ->" + contadorDeRepeticao);
        // System.out.println("Soma da idade ->" + somaIdade);

        sc.close();
    }
}
