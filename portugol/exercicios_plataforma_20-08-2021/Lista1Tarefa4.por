programa
{
	inclua biblioteca Matematica
	funcao inicio()
	{
		//variaveis
		inteiro a, b, c
		real R, S, D
		
		//entrada
		escreva("coloque o numero de A: ")
		leia(a)
		escreva("coloque o numero de B: ")
		leia(b)
		escreva("coloque o numero de e C: ")
		leia(c)
		
		//processamento
		R = Matematica.potencia(a+b, 2)
		S = Matematica.potencia(b+c, 2)
		D = R+S/2
		
		//saida
		escreva("resultado: "+D)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 384; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */