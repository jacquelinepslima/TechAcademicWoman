package exercicio.uri.valquiria_matter;

import java.util.Locale;
import java.util.Scanner;

    public class Ex1037 {
        public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner scanner = new Scanner(System.in);

            double valor;

            valor= scanner.nextDouble();

            String intervalo = "";
            if (valor >= 0 && valor <= 25.00) {
                intervalo = "Intervalo (0,25)";
            }else if (valor > 25.00 && valor <= 50.00){
                intervalo = "Intervalo (25,50)";
            }else if (valor > 50.00 && valor <= 75.00) {
                intervalo = "Intervalo (50,75)";
            }else if (valor > 75.00 && valor <= 100.00){
                intervalo = "Intervalo (75,100)";
            }else{
                intervalo = "Fora de intervalo";
            }
            System.out.println(intervalo);
            scanner.close();
        }
    }



