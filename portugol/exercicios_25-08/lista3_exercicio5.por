programa
{
	
	funcao inicio()
	{
		/*
		 * Faça um programa que mostre uma contagem na tela de 233 a 456, só que
		contando de 3 em 3 quando estiver entre 300 e 400 e de 5 em 5 quando não estiver.
		*/

		//variáveis
		inteiro numero

		numero = 233

		faca{
			se (numero >299 e numero <=400){
				numero = numero + 3
			}
			senao{
				numero = numero + 5
			}
		}
		enquanto(numero <=456)
		//numero = numero - 1
		escreva(numero)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 362; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {numero, 12, 10, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */