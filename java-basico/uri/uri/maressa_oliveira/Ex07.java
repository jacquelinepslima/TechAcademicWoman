package exercicio.uri.maressa_oliveira;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=0,y=0,i,j=0,linha;
        x= sc.nextInt();
        y= sc.nextInt();
        int matriz [][] = new int [x][y];
        for (i=0;i<x;i++){
            for(j=0;j<y;j++){
                matriz[i][j]=sc.nextInt();
            }
        }
        linha= sc.nextInt();
        linha--;
        int temp =matriz[linha][y-1];
        for (i=y-1;i>0;i--){
                matriz[linha][i]=matriz[linha][i-1];
        }
        matriz[linha][0]=temp;
        for (i=0;i<x;i++){
            for(j=0;j<y;j++){
                if (j!=y-1) {
                    System.out.print(matriz[i][j]+" ");
                }else{
                    System.out.println(matriz[i][j]);
                }
            }
        }
        sc.close();
    }
}
