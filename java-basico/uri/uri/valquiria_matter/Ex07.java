package exercicio.uri.valquiria_matter;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int mFilas = scan.nextInt();
        int nSoldados = scan.nextInt();

        int matriz[][] = new int[mFilas][nSoldados];
        int novaMatriz[][] = new int[mFilas][nSoldados];

        for(int i=0; i<mFilas; i++){
            for (int j=0; j<nSoldados; j++){
                matriz[i][j] = scan.nextInt();
            }
        }

        int numFila = scan.nextInt();
        numFila --;

//        for(int j=0; j<nSoldados; j++){
//            if(j<nSoldados-1){
//                novaMatriz[numFila][j+1] = matriz[numFila][j];
//            }else{
//                novaMatriz[numFila][0] = matriz[numFila][j];
//            }
//        }


        for(int i=0; i<mFilas; i++){
            for (int j=0; j<nSoldados; j++){

                if(i == numFila){
                    if(j<nSoldados-1){
                        novaMatriz[numFila][j+1] = matriz[numFila][j];
                    }else{
                        novaMatriz[numFila][0] = matriz[numFila][j];
                    }
                }else{
                    novaMatriz[i][j] = matriz[i][j];
                }
            }
        }

        for(int i=0; i<mFilas; i++) {
            for (int j = 0; j<nSoldados; j++) {
                System.out.print(novaMatriz[i][j] + " ");
            }
            System.out.println();
        }





    }
}
