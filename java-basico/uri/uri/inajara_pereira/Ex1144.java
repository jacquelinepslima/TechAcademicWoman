package exercicio.uri.inajara_pereira;

import java.util.Scanner;

public class Ex1144 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=0,i,fila=0,linha=0,coluna=0;
        n=sc.nextInt();

        for (i=1;i<=n;i++){
            fila =i;
            linha=i;
            coluna=i;
            linha *= fila;
            coluna *= linha;
            System.out.println(fila + " " + linha + " " + coluna);
            System.out.println(fila + " " + (linha+1) + " " + (coluna+1));
        }
        sc.close();
    }
}
