package lista1;

import java.util.Scanner;

public class Lista1Tarefa8 {
	public static void main(String[] args) {
		
		//variaveis
		double custoFabrica, valorTotal, porcentoDistribuidor, porcentoImpostos;
		Scanner leia = new Scanner(System.in);
		
		//entrada
		System.out.print("Digite o custo do preço de fábrica: ");
		custoFabrica = leia.nextDouble();
		
		//processamento
		porcentoDistribuidor = 0.28 * custoFabrica;
		porcentoImpostos = 0.45 * custoFabrica;
		
		valorTotal = (custoFabrica + porcentoDistribuidor + porcentoImpostos);
		
		//saída
		System.out.println("O preço final do carro é de R$"+valorTotal);
		
		
	}
}
