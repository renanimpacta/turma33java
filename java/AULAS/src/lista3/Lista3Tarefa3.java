package lista3;

import java.util.Scanner;

public class Lista3Tarefa3 {
	public static void main(String[] args) {
		/*
		 * Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
			21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
			idade for =-99. (WHILE)
		 */
		
		//variáveis
		Scanner leia = new Scanner(System.in);
		int idade=0, totalMais50=0, totalMenos21=0;
		
		
		//processo
		while(idade != -99) {
			//entrada
			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();
			
			if(idade >50) {
				totalMais50 = totalMais50+1;
			}
			else if(idade < 21 && idade > 0) {
				totalMenos21 = totalMenos21+1;
			}
		}
		
		System.out.printf("Temos %d pessoas com mais de 50 anos\n",totalMais50);
		System.out.printf("Temos %d pessoas com menos de 21 anos\n",totalMenos21);
		
	}
}
