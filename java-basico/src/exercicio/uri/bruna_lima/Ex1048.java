package exercicio.uri.bruna_lima;

import java.util.Locale;
import java.util.Scanner;

public class Ex1048 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double salario, reajuste=0,novoSalario = 0,porcentagemAumento=0;
        Scanner sc=new Scanner(System.in);
        salario=sc.nextDouble();
        novoSalario=salario;
        reajuste=salario;
        if((salario>=0)&&(salario<=400)){
            porcentagemAumento=0.15;
            reajuste*=porcentagemAumento;
            novoSalario*=(1+porcentagemAumento);
        }
        else if((salario>=400.01)&&(salario<=800)){
            porcentagemAumento=0.12;
            reajuste*=porcentagemAumento;
            novoSalario*=(1+porcentagemAumento);
        }
        else if((salario>=800.01)&&(salario<=1200)){
            porcentagemAumento=0.10;
            reajuste*=porcentagemAumento;
            novoSalario*=(1+porcentagemAumento);
        }
        else if((salario>=1200.01)&&(salario<=2000)){
            porcentagemAumento=0.07;
            reajuste*=porcentagemAumento;
            novoSalario*=(1+porcentagemAumento);
        }
        else{
            porcentagemAumento=0.04;
            reajuste*=porcentagemAumento;
            novoSalario*=(1+porcentagemAumento);
        }
        System.out.printf("Novo salario: %.2f%n",novoSalario);
        System.out.printf("Reajuste ganho: %.2f%n",reajuste);
        System.out.println("Em percentual: "+(int)(porcentagemAumento*100)+" %");
    }
}
