package exercicio.uri.samyra_figueiredo;

import java.util.Scanner;

public class Ex1146 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        while(x != 0){
            for(int i = 1; i <= x; i++){
                if(i == x){
                    System.out.println(i);
                }else{
                    System.out.print(i + " ");
                }
            }
            x = sc.nextInt();
        }

        sc.close();
    }
}
