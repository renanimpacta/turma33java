programa
{
	
	funcao inicio()
	{
		cadeia nome
		inteiro anoNascimento, anoAtual, idade

		escreva("Coloque seu nome: ")
		leia(nome)
		escreva("Coloque seu ano de nascimento: ")
		leia(anoNascimento)
		escreva("Em que ano estamos?: ")
		leia(anoAtual)

		idade = anoAtual - anoNascimento

		escreva("Bom dia "+nome+", sua idade aproximada é "+idade+" anos.")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 354; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */