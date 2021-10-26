package exercicio.uri.jacque_lima;

import java.util.Scanner;

public class Ex1049 {
	public static void main(String[]args) {
		Scanner src = new Scanner(System.in);
		
		String palavra1,palavra2,palavra3;
		
		palavra1 = src.next();
		palavra2 = src.next();
		palavra3 = src.next();
		
		if(palavra1.equals("vertebrado")) {
			if(palavra2.equals("ave")) {
				if(palavra3.equals("carnivoro")) {
					System.out.println("aguia");
				}else {
					System.out.println("pomba");
				}
				
			}else {
				if(palavra3.equals("onivoro")) {
					System.out.println("homem");
				}else {
					System.out.println("vaca");
				}
			}
		}else {
			if(palavra2.equals("inseto")) {
				if(palavra3.equals("hematofago")) {
					System.out.println("pulga");
				}else {
					System.out.println("lagarta");
				}
			}else {
				if(palavra3.equals("hematofago")) {
					System.out.println("sanguessuga");
				}else {
					System.out.println("minhoca");
				}
			}
			
		}
		
		
		src.close();
	}

}
