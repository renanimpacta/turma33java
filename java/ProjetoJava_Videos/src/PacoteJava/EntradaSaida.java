package PacoteJava;

import java.util.Scanner;

public class EntradaSaida {
	public static void main (String args[]) {
		
		
		//Variáveis
		Scanner ler = new Scanner(System.in);
		int a,b,soma;
		
		//Entrada
		System.out.println("Entre com o valor de A: ");
		a = ler.nextInt();
		
		System.out.println("Entre com o valor de B: ");
		b = ler.nextInt();
		
		//Processamento
		soma = a+b;
		
		//Saida
		System.out.println("A soma foi de: "+soma);
		
		
		
	}
}
