package lista3;

import java.util.Scanner;

public class Lista3Tarefa4 {
	public static void main(String[] args) {
		/*
		 * Uma empresa desenvolveu uma pesquisa para saber as características
			psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
			era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
			(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
			agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
			pessoas, calcule e mostre: (WHILE)
			 o número de pessoas calmas;
			 o número de mulheres nervosas;
			 o número de homens agressivos;
			 o número de outros calmos;
			 o número de pessoas nervosas com mais de 40 anos;
			 o número de pessoas calmas com menos de 18 anos.
		 */
		
		//variáveis
		Scanner leia = new Scanner(System.in);
		int idade=0, sexo=0, temperamento=0, controle=1;
		int pessoasCalmas=0, mulheresNervosas=0, homensAgressivos=0, outrosCalmos=0, nervosoMais40=0, calmoMenos18=0;
		
		//entrada
		while(controle<=150) {
			System.out.printf("%dº - Pessoa -----------------------------------------------------------\n", controle);
			System.out.print("Qual sua idade?: ");
			idade = leia.nextInt();
			
			System.out.print("Qual seu sexo? 1-feminino / 2-masculino / 3-Outros: ");
			sexo = leia.nextInt();
			while(sexo != 1 && sexo != 2 && sexo != 3) {
				System.out.print("1-feminino / 2-masculino / 3-Outros: ");
				sexo = leia.nextInt();
			}

			
			System.out.print("Qual seu temperamento? 1 calmo / 2 nervoso / 3 agressivo: ");
			temperamento = leia.nextInt();
			while(temperamento != 1 && temperamento != 2 && temperamento != 3) {
				System.out.println("1 calmo / 2 nervoso / 3 agressivo: ");
				temperamento = leia.nextInt();
			}
			
			controle++;
			

			if (temperamento == 1) {
				pessoasCalmas += 1;								
			}
			if (sexo == 1 && temperamento == 2) {
				mulheresNervosas += 1;
			} 
			if (sexo == 2 && temperamento == 3) {
				homensAgressivos += 1;
			}
			if (sexo == 3 && temperamento == 1) {
				outrosCalmos += 1;
			}
			if (temperamento == 2 && idade > 40) {
				nervosoMais40 += 1;
			}
			if (temperamento == 1 && idade < 18) {
				calmoMenos18 += 1;
			}
		}
		
		//saída
		System.out.println("\n_________________RESULTADO DA PESQUISA_____________________");
		System.out.println("O número de pessoas calmas: " + pessoasCalmas);
		System.out.println("O número de mulheres nervosas: " + mulheresNervosas);
		System.out.println("O número de homens agressivos: " + homensAgressivos);
		System.out.println("O número de outros calmos: " + outrosCalmos);
		System.out.println("O número de pessoas nervosas com mais de 40 anos: " + nervosoMais40);
		System.out.println("O número de pessoas calmas com menos de 18 anos: " + calmoMenos18);
		
		
	}
}
