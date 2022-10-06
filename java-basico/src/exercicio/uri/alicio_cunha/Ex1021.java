package exercicios.uri.ana_caroline;

import java.util.Locale;
import java.util.Scanner;

public class Ex1021 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double n;
        int qntNotas100;
        int qntNotas50;
        int qntNotas20;
        int qntNotas10;
        int qntNotas5;
        int qntNotas2;
        int qntNotas1;
        int restoDivisao;

        n = sc.nextDouble();


        int N = (int)n; //fazendo cast pra int pra realizar as divisoes corretamente


        qntNotas100 = N / 100;
        restoDivisao = N % 100;

        qntNotas50 = restoDivisao / 50;
        restoDivisao = restoDivisao % 50;

        qntNotas20 = restoDivisao / 20;
        restoDivisao = restoDivisao % 20;

        qntNotas10 = restoDivisao / 10;
        restoDivisao = restoDivisao % 10;

        qntNotas5 = restoDivisao / 5;
        restoDivisao = restoDivisao % 5;

        qntNotas2 = restoDivisao / 2;
        restoDivisao = restoDivisao % 2;

        qntNotas1 = restoDivisao / 1;
        restoDivisao = restoDivisao % 1;


        String numCompleto = Double.toString(n);
        int index1 = numCompleto.indexOf(".");
        String parteDepoisDoPonto = numCompleto.substring(index1);
        parteDepoisDoPonto = parteDepoisDoPonto.substring(1);

        int M = Integer.parseInt(parteDepoisDoPonto);

        /*
        * linha 50 a 55:
        * esse trecho de código serve para conseguir pegar o numero depois da vírgula, que corresponde ao centavos
        *  -linha 50: transformei o double que o usuario inseriu em string
        *  -linha 51: localizando onde o ponto está na string
        *  -linha 52:pegando a parte depois do ponto
        *  -linha 53: excluindo o ponto da string (provavelmente não seria necessário se eu tivesse feito a linha 56 diferente
        *  -linha 55: transformando a string com os centavos em int para efetuar a divisão
        * */


        // divisao das moedas

        int qntMoedas100;
        int qntMoedas050;
        int qntMoedas025;
        int qntMoedas010;
        int qntMoedas005;
        int qntMoedas001;

        qntMoedas100 = M / 100;
        restoDivisao = M % 100;

        qntMoedas050 = restoDivisao / 50;
        restoDivisao = restoDivisao % 50;

        qntMoedas025 = restoDivisao / 25;
        restoDivisao = restoDivisao % 25;

        qntMoedas010 = restoDivisao / 10;
        restoDivisao = restoDivisao % 10;

        qntMoedas005 = restoDivisao / 5;
        restoDivisao = restoDivisao % 5;

        qntMoedas001 = restoDivisao / 1;
        restoDivisao = restoDivisao % 1;


        System.out.println(N);
        System.out.printf("%d nota(s) de R$ 100,00 %n", qntNotas100);
        System.out.printf("%d nota(s) de R$ 50,00 %n", qntNotas50);
        System.out.printf("%d nota(s) de R$ 20,00 %n", qntNotas20);
        System.out.printf("%d nota(s) de R$ 10,00 %n", qntNotas10);
        System.out.printf("%d nota(s) de R$ 5,00 %n", qntNotas5);
        System.out.printf("%d nota(s) de R$ 2,00 %n", qntNotas2);
        System.out.printf("%d nota(s) de R$ 1,00 %n", qntNotas1);
        System.out.println();


        System.out.printf("%d moeda(s) de R$ 1,00 %n", qntMoedas100);
        System.out.printf("%d moeda(s) de R$ 0,50 %n", qntMoedas050);
        System.out.printf("%d moeda(s) de R$ 0,25 %n", qntMoedas025);
        System.out.printf("%d moeda(s) de R$ 0,10 %n", qntMoedas010);
        System.out.printf("%d moeda(s) de R$ 0,05 %n", qntMoedas005);
        System.out.printf("%d moeda(s) de R$ 0,01 %n", qntMoedas001);

        sc.close();
    }
}
