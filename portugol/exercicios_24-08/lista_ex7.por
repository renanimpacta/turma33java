programa
{
	
	funcao inicio()
	{
		/*
		 * 7) Receber valores de base e altura de um triângulo e verificar se são valores válidos
			(positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo.
		 */

		 //variavel
		 real base, altura, area
		 
		 //entrada
		 escreva("Digite o valor da base do triângulo: ")
		 leia(base)
		 escreva("Digite o valor da altura do triângulo: ")
		 leia(altura)
		 
		 //processamento
		 se(base > 0 e altura > 0){
		 	area = ((base*altura) / 2)
		 	escreva("A área do triando é: "+area)
		 }
		 senao{
		 	escreva("a base ou altura digitada é inválida, deve ser um número positivo")
		 }
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 402; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */