programa
{
	
	funcao inicio()
	{
		inteiro idade, mesNasc, diaNasc, idadeEmDias
		
		escreva("Qual sua idade?: ")
		leia(idade)
		escreva("Mês Nascimento: ")
		leia(mesNasc)
		escreva("Dia nascimento: ")
		leia(diaNasc)

		idadeEmDias = (idade * 365) + diaNasc + (mesNasc*30)

		escreva("Você tem aproximadamente "+idadeEmDias+" dias de idade")
		

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 84; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */