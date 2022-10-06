package exercicio.uri.isabel_oliveira;
import java.util.Locale;
import java.util.Scanner;
public class Ex06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int N,indiceLinha,indiceColuna;
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        double[][] matriz=new double[N][N];
        double[][] matrizAlterada=new double[N][N];
        double somaPositivos;
        somaPositivos=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                matriz[i][j]=sc.nextDouble();
            }
        }
        indiceLinha= sc.nextInt();
        indiceColuna=sc.nextInt();
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(matriz[i][j]>=0){
                    somaPositivos+=matriz[i][j];
                }
            }
        }
        System.out.println("SOMA POSITIVOS: "+somaPositivos);
        System.out.print("LINHA ESCOLHIDA: ");
        for(int i=0;i<N;i++){
            if(i!=N-1){
                System.out.print(matriz[indiceLinha][i]+" ");
            }
            else{
                System.out.println(matriz[indiceLinha][i]);
            }
        }
        System.out.print("COLUNA ESCOLHIDA: ");
        for(int i=0;i<N;i++){
            if(i!=N-1){
                System.out.print(matriz[i][indiceColuna]+" ");
            }
            else{
                System.out.println(matriz[i][indiceColuna]);
            }
        }
        System.out.print("DIAGONALPRINCIPAL: ");
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(i==j){
                    if(j!=N-1) {
                        System.out.print(matriz[i][j] + " ");
                    }
                    else{
                        System.out.println(matriz[i][j]);
                    }
                }
            }
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(matriz[i][j]>=0){
                    matrizAlterada[i][j]=matriz[i][j];
                }
                else{
                    matrizAlterada[i][j]=Math.pow(matriz[i][j],2);
                }

            }

        }
        System.out.println("MATRIZ ALTERADA");
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(j!=N-1){
                    System.out.print(matrizAlterada[i][j]+" ");
                }
                else{
                    System.out.println(matrizAlterada[i][j]);
                }

            }

        }
        sc.close();
    }
}
