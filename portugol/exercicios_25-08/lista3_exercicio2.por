programa
{
	
	funcao inicio()
	{
		/*
		 * Desenvolver um sistema que efetue a soma de todos os números ímpares que são
			múltiplos de três e que se encontram no conjunto dos números de 1 até 500.
		*/

		//variáveis
		inteiro numero, somaImpar
		//acumuladora
		somaImpar = 0
		//processamento
		para(inteiro x=1; x<=500; x++){
			se(x%2 != 0 e x%3 == 0){
				somaImpar = somaImpar + x
			}
		}

		escreva("O resultado é: "+somaImpar)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 293; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */