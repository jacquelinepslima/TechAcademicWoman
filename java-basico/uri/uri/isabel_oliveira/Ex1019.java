package exercicio.uri.isabel_oliveira;

import java.util.Scanner;

public class Ex1019 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N,hr,min,seg,restoDivisao;
        N=scanner.nextInt();
        hr=N/3600;
        restoDivisao=N%3600;
        min=restoDivisao/60;
        seg=restoDivisao%=60;
        System.out.println(hr+":"+min+":"+seg);
    }
}
