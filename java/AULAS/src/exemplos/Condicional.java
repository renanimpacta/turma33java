package exemplos;

import java.util.Scanner;

public class Condicional {
	public static void main(String[] args) {
		
		//variaveis
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int anoNascimento, idade;
		
		//entrada
		System.out.print("Digite seu nome: ");
		nome = leia.next();
		System.out.print("Digite o ano de nascimento: ");
		anoNascimento = leia.nextInt();
		
		//processamento
		idade = (2021 - anoNascimento);
		
		//saida
		System.out.printf("%s sua idade � %d anos", nome, idade);
		
		if(idade>45) {
			System.out.printf("%s sua idade � %d anos, vc � cringe", nome, idade);
		}
		else if(idade >= 18) {
			System.out.printf("%s sua idade � %d anos, vc � adulte",nome, idade);
		}
		else if(idade >= 13) {
			System.out.printf("%s sua idade � %d anos, vc � jovem", nome, idade);
		}
		else if (idade == 0) {
			System.out.printf("Recem-nascido!!!");
		}
		
	}
}
