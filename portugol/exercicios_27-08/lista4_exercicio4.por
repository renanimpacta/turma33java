programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		/*
		 * Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
		em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
		diagonal, ou seja, diagonal principal.
		 */

		 //variaveis
		 inteiro valores[3][3], linha=0, coluna=0
		 inteiro somaDiag=0, x=0

		 //entrada e processamento
		 para(linha=0; linha<3; linha++){
		 	para(coluna=0; coluna<3; coluna++){	
		 		valores[linha][coluna] = sorteia(0,10)
		 		escreva("["+valores[linha][coluna]+"]")
		 	}
		 	escreva("\n")
		 }

		 para(x=0; x<3; x++){
		 	somaDiag = somaDiag + valores[x][x] //identifica a diago quando LINHA e COLUNA tem o mesmo número
		 }
		 
		 //saida
		 escreva("\n")
		 escreva("A soma da diagonal prncipal é: "+somaDiag)
		 escreva("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 722; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */