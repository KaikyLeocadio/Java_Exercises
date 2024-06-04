package javacondicionais;

import java.util.Scanner;

public class CálculoIMC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner valor = new Scanner (System.in);
		
		System.out.println("Insira seu peso:");
		float peso = valor.nextFloat();
		
		System.out.println("Insira sua altura:");
		float altura = valor.nextFloat();
		
		float calculoIMC = peso / (altura * altura);
		
		if (calculoIMC < 17) {
		System.out.println("Você está muito abaixo do peso");
		} else if (calculoIMC >= 17 && calculoIMC <= 18.49) {
		System.out.println("Você está abaixo do pesoo");
		} else if (calculoIMC >= 18.5 && calculoIMC <= 24.99) {
		System.out.println("Você está com o peso normal");
		} else if (calculoIMC >= 25 && calculoIMC <= 29.99) {
		System.out.println("Você está acima do peso");
		} else if (calculoIMC >= 30 && calculoIMC <= 34.99) {
		System.out.println("Você está com obesidade I");
		} else if (calculoIMC >= 35 && calculoIMC <= 39.99) {
		System.out.println("Você está com obesidade II (Severa)");
		} else if (calculoIMC >= 40) {
		System.out.println("Você está com obesidade III (Mórbida)");
		} else {
		System.out.println("Morra");
		}
	}

}