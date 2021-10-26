package exercicio.uri.bruna_lima;
import java.util.Locale;
import java.util.Scanner;

public class Ex1045 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        float A,B,C;
        float[] ordenados=new float[3];
        Scanner sc=new Scanner(System.in);
        A=sc.nextFloat();
        B=sc.nextFloat();
        C=sc.nextFloat();
        if((A>=B)&&(A>=C)){
            ordenados[2]=A;
            if(B>=C){
                ordenados[1]=B;
                ordenados[0]=C;
            }
            else{
                ordenados[1]=C;
                ordenados[0]=B;
            }
        }
        else if((B>=A)&&(B>=C)){
            ordenados[2]=B;
            if(C>=A){
                ordenados[1]=A;
                ordenados[0]=C;
            }
            else{
                ordenados[1]=C;
                ordenados[0]=A;
            }
        }
        else if((C>=A)&&(C>=B)){
            ordenados[2]=C;
            if(A>B){
                ordenados[1]=A;
                ordenados[0]=B;
            }
            else{
                ordenados[1]=B;
                ordenados[0]=A;
            }
        }
        if(ordenados[2]>=(ordenados[1]+ordenados[0])){
            System.out.println("NAO FORMA TRIANGULO");
        }
        else if(Math.pow(ordenados[2],2)==(Math.pow(ordenados[1],2)+Math.pow(ordenados[0],2))){
            System.out.println("TRIANGULO RETANGULO");
        }
        else if(Math.pow(ordenados[2],2)>(Math.pow(ordenados[1],2)+Math.pow(ordenados[0],2))){
            System.out.println("TRIANGULO OBTUSANGULO");
        }
        else if(Math.pow(ordenados[2],2)<(Math.pow(ordenados[1],2)+Math.pow(ordenados[0],2))){
            System.out.println("TRIANGULO ACUTANGULO");
        }
        if((ordenados[2]==ordenados[1])&&(ordenados[1]==ordenados[0])){
            System.out.println("TRIANGULO EQUILATERO");
        }
        else if((ordenados[2]==ordenados[1])||(ordenados[1]==ordenados[0])||(ordenados[2]==ordenados[0])){
            System.out.println("TRIANGULO ISOSCELES");
        }
    }
}
