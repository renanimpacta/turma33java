package lista1;

import java.util.Scanner;

public class Lista1Tarefa8 {
	public static void main(String[] args) {
		
		//variaveis
		double custoFabrica, valorTotal, porcentoDistribuidor, porcentoImpostos;
		Scanner leia = new Scanner(System.in);
		
		//entrada
		System.out.print("Digite o custo do pre�o de f�brica: ");
		custoFabrica = leia.nextDouble();
		
		//processamento
		porcentoDistribuidor = 0.28 * custoFabrica;
		porcentoImpostos = 0.45 * custoFabrica;
		
		valorTotal = (custoFabrica + porcentoDistribuidor + porcentoImpostos);
		
		//sa�da
		System.out.println("O pre�o final do carro � de R$"+valorTotal);
		
		
	}
}
