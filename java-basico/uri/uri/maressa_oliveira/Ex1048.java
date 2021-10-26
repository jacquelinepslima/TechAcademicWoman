package exercicio.uri.maressa_oliveira;

import javax.sound.midi.SysexMessage;
import java.util.Locale;
import java.util.Scanner;

public class Ex1048 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        double salario = 0, novosalario = 0,percentual = 0,reajuste = 0;
        salario=scanner.nextDouble();
        if((salario>=0)&&(salario<=400.00)){
            percentual=0.15;
            reajuste=salario*percentual;
            novosalario=salario+reajuste;
        }else if((salario>=400.01)&&(salario<=800.00)){
            percentual=0.12;
            reajuste=salario*percentual;
            novosalario=salario+reajuste;
        }else if((salario>=800.01)&&(salario<=1200.00)){
            percentual=0.10;
            reajuste=salario*percentual;
            novosalario=salario+reajuste;
        }else if((salario>=1200.01)&&(salario<=2000.00)){
            percentual=0.07;
            reajuste=salario*percentual;
            novosalario=salario+reajuste;
        }else if(salario>2000.00){
            percentual=0.04;
            reajuste=salario*percentual;
            novosalario=salario+reajuste;
        }
        System.out.printf("Novo salário: %.2f%n",novosalario);
        System.out.printf("Reajuste ganho: %.2f%n",reajuste);
        System.out.printf("Em percentual: %d %%",(int) (percentual*100),"%n");
        scanner.close();
    }
}
