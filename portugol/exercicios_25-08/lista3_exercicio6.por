programa
{
	
	funcao inicio()
	{
		/*
		 * Faça um programa que pegue um número do teclado e calcule a soma de todos os
		números de 1 até ele. Ex.: o usuário entra 7, o programa vai mostrar 28, pois
		1+2+3+4+5+6+7=28.
		 */

		//variáveis
		inteiro numero, contadora, resultado

		contadora = 1 //Contadora
		resultado = 0
		//entrada - processamento
		escreva("Digite um número: ")
		leia(numero)
		
		faca{
			escreva(contadora)
			se(contadora < numero){
				escreva("+")
			}
			resultado = resultado + contadora
			contadora ++
		}
		enquanto(contadora <= numero) 
		escreva(" = "+resultado)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 481; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {numero, 13, 10, 6}-{contadora, 13, 18, 9}-{resultado, 13, 29, 9};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */