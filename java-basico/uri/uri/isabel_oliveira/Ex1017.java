package exercicio.uri.isabel_oliveira;

import java.util.Locale;
import java.util.Scanner;

public class Ex1017 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int tempoGastoViagem,velocidadeMedia;
        double quantidadeLitros=0;
        Scanner sc=new Scanner(System.in);
        tempoGastoViagem=sc.nextInt();
        velocidadeMedia=sc.nextInt();
        sc.close();
        quantidadeLitros=(tempoGastoViagem*velocidadeMedia)/12.0;
        System.out.printf("%.3f%n",quantidadeLitros);
    }
}
