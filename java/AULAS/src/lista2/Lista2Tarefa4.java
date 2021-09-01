package lista2;

import java.util.Locale;
import java.util.Scanner;

public class Lista2Tarefa4 {
	public static void main(String[] args) {
		/*
		 * Faça um programa em que permita a entrada de um número qualquer e exiba se este
		número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
		ímpar exiba o número elevado ao quadrado.
		 */
		
		Locale.setDefault(Locale.US); //Define o padrão númerico Double com "." ex "3.0"
		
		//variáveis
		Scanner leia = new Scanner(System.in);
		double numero, raiz;
		
		//entrada
		System.out.println("Digite um número: ");
		numero = leia.nextDouble();
		
		//Processamento
		if((numero%2)==0) {
			raiz = Math.sqrt(numero);
			System.out.printf("%.2f é par e sua raíz quadrada é aproximadamente %.2f",numero,raiz);
		}
		else if(numero == 0) {
			System.out.println("0 é neuto");
		}
		else if(numero < 0) {
			System.out.println("Não pode negativo");
		}
		else {
			System.out.printf("%.2f é ímpar",numero);
		}
	}
}
