package lista2;

import java.util.Scanner;

public class Lista1Tarefa1 {

	public static void main(String[] args) {
		
		/*
		 * Faça um programa que receba três inteiros e diga qual deles é o maior.
		 */
		
		//variaveis
		Scanner leia = new Scanner(System.in);
		int a, b, c;
		
		//entradas
		System.out.println("Digite o número 1: ");
		a = leia.nextInt();
		System.out.println("Digite o número 1: ");
		b = leia.nextInt();
		System.out.println("Digite o número 1: ");
		c = leia.nextInt();
		
		//processamento
		if(a==b && b==c) {
			System.out.printf("%d, %d, %d",a,b,c); // todos os números iguais
		}
		else if (a>b && a>c) {
			System.out.printf("%d é o maior",a); // diferentes na ordem 
		}
		else if (b>a && a>c) {
			System.out.printf("%d é o maior",b); // diferentes na ordem a,c,b
		}
		else if (c>b && c>a) {
			System.out.printf("%d é maor",c); // diferentes na ordem a,c,b
		}
		else {
			System.out.printf("inválido");
		}
		

	}

}
