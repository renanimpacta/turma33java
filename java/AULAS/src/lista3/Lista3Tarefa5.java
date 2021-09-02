package lista3;

import java.util.Scanner;

public class Lista3Tarefa5 {
	public static void main(String[] args) {
		/*
		 * Crie um programa que leia um número do teclado até que encontre um
			número igual a zero. No final, mostre a soma dos números
			digitados.(DO...WHILE)
		 */
		
		//variável
		Scanner leia = new Scanner(System.in);
		int numero, total=0;
		
		do {
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			
			total = total + numero;
		}
		while(numero != 0);
		System.out.println("Total: "+total);
	}
}
