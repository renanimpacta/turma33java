programa
{
	
	funcao inicio()
	{
		/* Faça um sistema que leia o tempo de duração de um evento em uma fábrica
		 * expressa em segundos e mostre-o expresso em horas, minutos e segundos.
		*/

		inteiro totalSegundos, tempoHoras, tempoMinutos, tempoSegundos

		escreva("Coloque o tempo do evento em segundos: ")
		leia(totalSegundos)

		tempoHoras = totalSegundos/3600
		tempoMinutos = (totalSegundos%3600)/60
		tempoSegundos = (totalSegundos%3600)%60

		escreva("O evento teve "+tempoHoras+" horas, "+tempoMinutos+" minutos e "+tempoSegundos+" segundos")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 422; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */