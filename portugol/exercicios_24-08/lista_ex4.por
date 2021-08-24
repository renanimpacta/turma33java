programa
{
	
	funcao inicio()
	{
		/*
		 * 4) Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este
			número é par ou ímpar, e se é positivo ou negativo.
		 */

		 //variável
		 inteiro num
		 //entrada
		 escreva("Digite um número inteiro: ")
		 leia(num)
		 //processamento
		 se(num%2 == 0 e num < 0){
		 	escreva("O número "+num+" é NEGATIVO e é PAR")
		 }
		 senao se(num%2 == 0 e num > 0){
		 	escreva("O número "+num+" é POSITIVO e é PAR")
		 }
		 senao se(num%2 != 0 e num < 0){
		 	escreva("O número "+num+" é NEGATIVO e é ÍMPAR")
		 }
		 senao{
		 	escreva("O número "+num+" é POSITIVO e é ÍMPAR")
		 }
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 630; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */