package lista2;

import java.util.Scanner;

public class Lista1Tarefa1 {

	public static void main(String[] args) {
		
		/*
		 * Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
		 */
		
		//variaveis
		Scanner leia = new Scanner(System.in);
		int a, b, c;
		
		//entradas
		System.out.println("Digite o n�mero 1: ");
		a = leia.nextInt();
		System.out.println("Digite o n�mero 1: ");
		b = leia.nextInt();
		System.out.println("Digite o n�mero 1: ");
		c = leia.nextInt();
		
		//processamento
		if(a==b && b==c) {
			System.out.printf("%d, %d, %d",a,b,c); // todos os n�meros iguais
		}
		else if (a>b && a>c) {
			System.out.printf("%d � o maior",a); // diferentes na ordem 
		}
		else if (b>a && a>c) {
			System.out.printf("%d � o maior",b); // diferentes na ordem a,c,b
		}
		else if (c>b && c>a) {
			System.out.printf("%d � maor",c); // diferentes na ordem a,c,b
		}
		else {
			System.out.printf("inv�lido");
		}
		

	}

}
