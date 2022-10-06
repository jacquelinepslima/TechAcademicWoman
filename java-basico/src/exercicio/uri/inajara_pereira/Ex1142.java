package exercicio.uri.inajara_pereira;

import java.util.Scanner;

public class Ex1142 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=0,i,fila=0,linha=0,coluna=0;
        String palavra=" PUM";
        n=sc.nextInt();
       
        for (i=0;i<n;i++){
                fila +=1;
                linha =+ fila + 1;
                coluna = linha + 1;
                System.out.println(fila + " " + linha + " " + coluna + palavra);
                fila=coluna+1;
        }
        sc.close();
    }
}
