programa
{
	
	funcao inicio()
	{
		//variáveis
		inteiro numero

		//entrada
		escreva("Digite um número: ")
		leia(numero)
		
		//saída
		se(numero == 0){
			escreva(numero+" é neutro")
		} senao se(numero < 0){
			escreva("Não é permitido número negativo")
		} senao se(numero % 2 == 0){
			escreva(numero+" é par")
		} senao {
			escreva(numero+" é ímpar")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 182; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */