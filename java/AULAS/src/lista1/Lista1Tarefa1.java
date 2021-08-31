package lista1;


import java.util.Scanner;

public class Lista1Tarefa1 {
	public static void main(String[] args) {
		
		//variáveis
		int idade, mesNasc, diaNasc, idadeEmDias;
		Scanner leia = new Scanner(System.in);
		
		//entrada
		System.out.print("Qual sua idade?: ");
		idade = leia.nextInt();
		
		System.out.print("Mês de nascimento: ");
		mesNasc = leia.nextInt();
		
		System.out.print("Dia nascimento: ");
		diaNasc = leia.nextInt();
		
		//processamento
		idadeEmDias = (idade * 365) + diaNasc + (mesNasc*30);
		
		//saida
		System.out.println("Você tem aproximadamente "+idadeEmDias+" dias de idade");
		
		
	}
}
