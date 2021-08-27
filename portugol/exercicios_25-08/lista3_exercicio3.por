programa
{
	
	funcao inicio()
	{
		/*
		 * Elaborar um programa que efetue a leitura sucessiva de valores numéricos e
			apresente no final o total do somatório, a média e o total de valores lidos. O programa
			deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores
			positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor
			negativo.
		 */
		
		//variáveis
		inteiro contadora
		real numero, somaTodos, mediaTodos

		numero = 1.0
		somaTodos = 0.0
		contadora = 0
		
		//entrada - processamento 
		enquanto(numero >= 0){
			escreva("Digite um número: ")
			leia(numero)
			
			se(numero > 0){
				somaTodos = somaTodos + numero
				contadora ++
			}
			
		}

		limpa()
		mediaTodos = (somaTodos / contadora)

		escreva("A soma de todos os valores digitados é: "+somaTodos+"\n")
		escreva("Foram lidos "+contadora+" números no total\n")
		escreva("A media de todos os valores digitados é: "+mediaTodos)
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 504; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */