package exercicio.uri.byanca_calixto;

import java.util.Scanner;

public class Ex1132 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int X, Y, menor, maior, soma=0;
        // entro com os valores
        X = sc.nextInt();
        Y = sc.nextInt();

        // verifico quem é o maior ou o menor -> 'não necessariamente em ordem crescente.'
        if (X>Y){
            maior=X;
            menor=Y;
        }
        else{
            maior=Y;
            menor=X;
        }

        //verificando no intervalo dos valores(contando com ambos) quais deles não são divisiveis por 13
        for(int i=menor;i<=maior;i++){
            if(i%13!=0){
                // fazendo a soma dos valores desse intervalo
                soma+=i;
            }
        }

        //imprimindo
        System.out.println(soma);

        sc.close();
    }
}
