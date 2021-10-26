package exercicio.uri.caroline_souza;

import java.util.Scanner;

public class Ex1061 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		String  diaInicioCompleto = scanner.nextLine();
		String diaInicioString = diaInicioCompleto.substring(4, 5);
		int diaInicio = Integer.parseInt(diaInicioString);
		//System.out.printf("O dia em int:  %d",diaInicio);
		
		String momentoCompleto = scanner.nextLine();
		String horaString = momentoCompleto.substring(1,2);
		int horaInicio = Integer.parseInt(horaString);
		//System.out.printf("Hora em int: %d",hora);
		
		String minutoString = momentoCompleto.substring(5,7);
		int minutoInicio = Integer.parseInt(minutoString);
		//System.out.printf("minuto em int: %d",minuto);
		
		String segundoString = momentoCompleto.substring(10,12);
		int segundoInicio = Integer.parseInt(segundoString);
		//System.out.printf("segundo em int: %d",segundo);
		
		String  diaFinalCompleto = scanner.nextLine();
		String diaFinalString = diaFinalCompleto.substring(4, 5);
		int diaFinal = Integer.parseInt(diaFinalString);
		//System.out.printf("Dia final em int:  %d",diaFinal);
		
		String momentoCompletoFinal = scanner.nextLine();
		String horaFinalString = momentoCompletoFinal.substring(1,2);
		int horaFinal = Integer.parseInt(horaFinalString);
		//System.out.printf("Hora final em int: %d",horaFinal);
		
		String minutoFinalString = momentoCompletoFinal.substring(5,7);
		int minutoFinal = Integer.parseInt(minutoFinalString);
		//System.out.printf("minuto final em int: %d",minutoFinal);
		
		String segundoFinalString = momentoCompletoFinal.substring(10,12);
		int segundoFinal = Integer.parseInt(segundoFinalString);
		System.out.printf("segundo final em int: %d",segundoFinal);
		
		scanner.close();
	}

}
