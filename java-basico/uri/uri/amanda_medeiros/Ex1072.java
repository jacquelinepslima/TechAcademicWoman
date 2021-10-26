package exercicio.uri.amanda_medeiros;
import java.util.Scanner;

public class Ex1072 {
    public static void main(String[] args) {
        int N,numero,countIn,countOut;
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        countIn=0;
        countOut=0;
        for(int i=0;i<N;i++) {
            numero = sc.nextInt();
            if ((numero >= 10) && (numero <= 20)) {
                countIn++;
            } else {
                countOut++;
            }
        }
        sc.close();
        System.out.println(countIn+" in");
        System.out.println(countOut+" out");
    }
}
