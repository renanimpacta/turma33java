programa
{

	funcao inicio()
	{
		/*
		 * Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
		que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
		imprima a média aritmética dos lançamentos, contabilize e apresente também
		quantas foram as ocorrências da maior pontuação.
		 */

		//variaveis
		inteiro lancamentos[10]
		inteiro x
		inteiro maiorNum = 0, vezesMaiorNum = 0
		real totalSoma = 0.0, mediaLancamentos = 0.0
		
		//entrada e processamento
		para(x = 0; x<=9; x++){
			lancamentos[x] = sorteia(1, 6)
			totalSoma = totalSoma + lancamentos[x]
			
		     escreva("["+lancamentos[x]+"]")

			//determina o maior num
			se(lancamentos[x] > maiorNum){
				maiorNum = lancamentos[x]
			}
		}

		//determina quantas veze so maior num aparece
		para(x = 0; x<=9; x++){
			se(maiorNum == lancamentos[x]){
				vezesMaiorNum ++
			}
		}

		mediaLancamentos = totalSoma / 10

		//saida
		escreva("\n")
		escreva("A média aritimética dos lançamentos é: "+mediaLancamentos+"\n")
		escreva("O maior número lançado foi: "+maiorNum+"\n")
		escreva("Ele apareceu "+vezesMaiorNum+" vez(es)")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 11; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {lancamentos, 14, 10, 11};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */