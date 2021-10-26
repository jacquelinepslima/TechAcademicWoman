package exercicio.uri.amanda_medeiros;
import java.util.Locale;
import java.util.Scanner;

public class Ex1079 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        int N;
        double N1,N2,N3;
        double [] medias= new double[3];
        N= sc.nextInt();
        for(int i=0;i<N;i++){
            N1=sc.nextDouble();
            N2=sc.nextDouble();
            N3=sc.nextDouble();
            medias[i]=(N1*2+N2*3+N3*5)/(2+3+5);
        }
        for(int i=0;i<N;i++){
            System.out.printf("%.1f%n",medias[i]);
        }
    }
}
