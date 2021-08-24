programa
{
	
	funcao inicio()
	{
		/*
		 * O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
			percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
			Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
			escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
			consumidor.
		 */

		 //Variável
		 real custoFabrica, valorTotal, porcentoDistribuidor, porcentoImpostos
		 //entrada
		 escreva("Digite o custo do preço de fábrica: ")
		 leia(custoFabrica)
		 //processamento
		 porcentoDistribuidor = 0.28 * custoFabrica

		 porcentoImpostos = 0.45 * custoFabrica
		 
		 valorTotal = (custoFabrica + porcentoDistribuidor + porcentoImpostos)
		 
		 //saída
		 escreva("O preço final do carro é de R$"+valorTotal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 604; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */