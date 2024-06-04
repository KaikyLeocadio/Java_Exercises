package javacondicionais;

import java.util.Scanner;

public class Weeks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// quando você já preve o resultado, é recomendável utilizar switch case
		
		Scanner numero = new Scanner(System.in);

		String nome_dia;
		
		System.out.println("Insira o valor do dia:");
		int numero_dia = numero.nextInt();
		
		switch(numero_dia) {
		case 1: nome_dia = "Domingo"; break;
		case 2: nome_dia = "Segunda-Feira"; break;
		case 3: nome_dia = "Terça-Feira"; break;
		case 4: nome_dia = "Quarta-Feira"; break;
		case 5: nome_dia = "Quinta-Feira"; break;
		case 6: nome_dia = "Sexta-Feira"; break;
		case 7: nome_dia = "Sábado"; break;
		
		default: nome_dia = "Dia dos crias";
		}
		System.out.println(nome_dia);
	}
  
}
