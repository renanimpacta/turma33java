programa
{
	
	funcao inicio()
	{
		/*
		 * 1) João, homem de bem, comprou um microcomputador para controlar o rendimento diário
			de seu trabalho. Toda vez que ele traz um peso de tomate maior que o estabelecido pelo
			regulamento do estado de São Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo
			excedente. João precisa que você faça um sistema que leia a variável P (peso de tomates) e
			verifique se há excesso. Se houver, gravar na variável E (Excesso) e na variável M o valor
			da multa que João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo
			ZERO.
		 */

		 //variável
		 real P /*peso*/, E/*excesso*/, M/*multa*/
		 
		 //entrada
		 escreva("Digite o peso total dos tomates: ")
		 leia(P)
		 
		 //processamento
		 se(P > 50){
		 	E = (P - 50)
		 	M = 4.0 * E
		 	escreva("Você excedeu o limite de peso em "+E+"kg, e deverá pagar R$"+M+" de multa")
		 } senao {
		 	escreva("Peso ok")
		 }
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 913; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */