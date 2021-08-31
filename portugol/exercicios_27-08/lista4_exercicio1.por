programa
{
	
	funcao inicio()
	{
		/*
		 * Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
		atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
		 */

		//variaveis
		inteiro valores[5]
		inteiro x, maiorNumero = 0
		
		//entrada e processamento
		para(x=0; x<=4; x++){
			escreva("Digite um valor: ")
			leia(valores[x])
		}
		escreva("\n")
		para(x=0; x<=4; x++){
			escreva("["+valores[x]+"]")

			se(valores[x] > maiorNumero){ //INVERSÃO
				maiorNumero = valores[x]
			}
		}

		//saida
		escreva("\n")
		escreva("O maior valor desse vetor é: "+maiorNumero)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 504; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {valores, 12, 10, 7}-{x, 13, 10, 1}-{maiorNumero, 13, 13, 11};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */