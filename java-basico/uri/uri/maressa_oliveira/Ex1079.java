package exercicio.uri.maressa_oliveira;

import java.util.Locale;
import java.util.Scanner;

public class Ex1079 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc =new Scanner(System.in);
        int N=0,i;
        double n1,n2,n3,media = 0;
        N= sc.nextInt();
        double[] medias = new double[N];
        for(i=0; i<N; i++){
            n1=sc.nextDouble();
            n2= sc.nextDouble();
            n3= sc.nextDouble();
            medias[i]=((n1*2)+(n2*3)+(n3*5))/10;

        }
        for(i=0; i<N; i++) {
            System.out.printf("%.1f %n", medias[i]);
        }
        sc.close();
    }
}
