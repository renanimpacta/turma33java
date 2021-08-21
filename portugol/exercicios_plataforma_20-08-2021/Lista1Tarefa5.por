programa
{
	
	funcao inicio()
	{
		/*
		 * Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
			aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
			respectivamente.
		 */

		 //variaveis
		 real nota1, nota2, nota3, media, mediaPonderada
		 //entrada
		 escreva("Coloque a nota1: ")
		 leia(nota1)
		 escreva("Coloque a nota2: ")
		 leia(nota2)
		 escreva("Coloque a nota3: ")
		 leia(nota3)
		 
		 //processamento
		 media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5))/10
		 
		 //saida
		 escreva("A media ponderada final é: "+media)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 546; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */