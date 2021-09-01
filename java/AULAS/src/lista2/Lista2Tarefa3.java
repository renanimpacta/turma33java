package lista2;

import java.util.Scanner;

public class Lista2Tarefa3 {
	public static void main(String[] args) {
		
		/*
		 * Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
			categoria ela se encontra:
			 10-14 infantil
			 15-17 juvenil
			 18-25 adulto
		 */
		
		//variaveis
		Scanner leia = new Scanner(System.in);
		int idade;
		
		//entrada
		System.out.println("Digite uma idade: ");
		idade = leia.nextInt();
		
		//processamento
		if(idade >=10 && idade <=14) {
			System.out.printf("Você é infantil");
		}
		else if(idade >=15 && idade <=17) {
			System.out.println("Você é juvenil");
		}
		else if(idade >=18) {
			System.out.println("Você é adulto");
		}
	}
}
