programa
{
	inclua biblioteca Matematica
	funcao inicio()
	{
		//Variáveis
		real x1, x2, y1, y2, d
		//entradas
		escreva("Determine x1: ")
		leia(x1)
		escreva("Determine x2: ")
		leia(x2)
		escreva("Determine y1: ")
		leia(y1)
		escreva("Determine y2: ")
		leia(y2)
		//processamento
		d = Matematica.raiz((Matematica.potencia((x2-x1), 2) + Matematica.potencia((y2-y1), 2)), 2)
		//saida
		escreva("Resultado: "+d)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 395; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */