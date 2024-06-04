package javacondicionais;

import java.util.Scanner;

public class MediaAlunos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner valor = new Scanner (System.in);
		
		
		System.out.println("Digite a primeira nota:");
		float nota1 = valor.nextFloat();
		
		System.out.println("Digite a segunda nota:");
		float nota2 = valor.nextFloat();
				
		System.out.println("Digite a terceira nota:");
		float nota3 = valor.nextFloat();
		
		System.out.println("Digite a quarta nota:");
		float nota4 = valor.nextFloat();
		
	    float media = (nota1 + nota2 + nota3 + nota4) / 4;
		System.out.println("A média é: " + media);
		
		if (media >= 6){
		System.out.println("O aluno está aprovado!");
		} else if (media >=5) {
		System.out.println("O aluno vai ficar de molho!");
		} else {
		System.out.println("O aluno está reprovado!");
		}
		
	}

}
