package exercicio.uri.amanda_medeiros;

import java.util.Scanner;

public class Ex1146 {
    public static void main(String[] args) {
        String sequencia="";
        int x=0;
        Scanner sc=new Scanner(System.in);
        x=1;
        do{
            x=sc.nextInt();
            for(int i=1;i<=x;i++){
                if(i!=x){
                    sequencia+=i+" ";
                }
                else{
                    sequencia+=i+"\n";
                }
            }
        }while (x!=0);
        System.out.println(sequencia);
        sc.close();
    }
}
