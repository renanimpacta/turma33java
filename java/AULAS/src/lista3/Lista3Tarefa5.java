package lista3;

import java.util.Scanner;

public class Lista3Tarefa5 {
	public static void main(String[] args) {
		/*
		 * Crie um programa que leia um n�mero do teclado at� que encontre um
			n�mero igual a zero. No final, mostre a soma dos n�meros
			digitados.(DO...WHILE)
		 */
		
		//vari�vel
		Scanner leia = new Scanner(System.in);
		int numero, total=0;
		
		do {
			System.out.println("Digite um n�mero: ");
			numero = leia.nextInt();
			
			total = total + numero;
		}
		while(numero != 0);
		System.out.println("Total: "+total);
	}
}
