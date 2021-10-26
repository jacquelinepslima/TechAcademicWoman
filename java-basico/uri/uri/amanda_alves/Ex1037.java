package exercicio.uri.amanda_alves;

//Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos seguintes intervalos
//        ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em nenhum destes intervalos,
//        deverá ser impressa a mensagem “Fora de intervalo”.
//
//        O símbolo ( representa "maior que". Por exemplo:
//        [0,25]  indica valores entre 0 e 25.0000, inclusive eles.
//        (25,50] indica valores maiores que 25 Ex: 25.00001 até o valor 50.0000000


import java.util.Locale;
import java.util.Scanner;

public class Ex1037 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner scanner = new Scanner(System.in);

        double valor = scanner.nextDouble();
        String intervalo = "";

        if (valor >= 0 && 25.00000 >= valor){
            intervalo = "[0, 25]";
            System.out.println("Intervalo " + intervalo);
        }else if (valor >= 25.00001 && 50.00000 >= valor ){
            intervalo = "[25, 50]";
            System.out.println("Intervalo " + intervalo);
        }else if (valor >= 50.00001 && 75.00000 >= valor){
            intervalo = "[50, 75]";
            System.out.println("Intervalo " + intervalo);
        }else if (valor >= 75.00001 && 100.00000 >= valor){
            intervalo = "[75, 100]";
            System.out.println("Intervalo " + intervalo);
        }else{
            System.out.println("Fora de intervalo");
        }
    }
}
