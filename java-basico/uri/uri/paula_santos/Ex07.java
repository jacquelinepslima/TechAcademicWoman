package exercicio.uri.paula_santos;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();  //filas
        int n = sc.nextInt();  //qtd de soldados

        int [][] pelotao = new int [m][n];


        //Populando a tabela com a númeração dos soldados
        for(int i =0; i < m; i++){
            for(int j = 0; j < n; j++){
                pelotao[i][j] = sc.nextInt();
            }
        }

        //fileira da qual será feita a troca de posições
        int troca = sc.nextInt();

        //girando a fila
        for(int i =0; i < m; i++){
            if (i == troca-1){
                System.out.print(pelotao[i][n-1]);
            }
            for(int j = 0; j < n; j++){
                if (i == troca-1){
                    if(j < n-1) {
                        System.out.print(" " + pelotao[i][j]);
                    }
                }
            }
        }
        sc.close();
    }
}
