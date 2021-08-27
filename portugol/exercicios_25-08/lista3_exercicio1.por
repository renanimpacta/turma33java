programa
{
	inclua biblioteca Matematica --> math
	funcao inicio()
	{
		/*
		 * A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
			coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:  
			a) média do salário da população;
			b) média do número de filhos;
			c) maior salário;
			d) percentual de pessoas com salário até R$100,00.
		 */

		 //variáveis
		 real salario, totalSalario, mediaSalario, maiorSalario, percentSalario //variáveis salário
		 real filhos, totalFilhos, mediaFilhos //variáveis filho
		 inteiro contadoraHab, contadoraAte100

		 const real QTD=3
		 
		 //contadoras
		 contadoraHab = 1
		 contadoraAte100 = 0
		 //acumuladoras
		 totalSalario = 0.0 
		 totalFilhos = 0.0
		 //inversão
		 maiorSalario = 0.0

		 //Entrada - processamento
		 para(inteiro x=1; x<=QTD; x++){
		 	
			 escreva("Olá habitante número "+contadoraHab+"\n")
			 
			 escreva("Digite o seu salário: R$")
			 leia(salario)
	
			 escreva("Digite o número de filhos: ")
			 leia(filhos)

			 escreva("*****************************\n")

			 //conta o número do habitante
			 contadoraHab ++
			 //total salário e filhos
			 totalSalario += salario
			 totalFilhos += filhos
			 
			 //identifica o maior salário
			 se(salario > maiorSalario){
			 	maiorSalario = salario
			 }

			 //mais que R$100
			 se(salario <= 100){
			 	contadoraAte100 ++ // conta salários até 100
			 }
			 
		 }
		
		 percentSalario =  (contadoraAte100 / QTD) * 100.00 // percentual até R$100
		 mediaSalario = (totalSalario / QTD) // média de salário
		 mediaFilhos = (totalFilhos / QTD) // média de filhos

		 //saída
		 limpa()
		 escreva("Essa população tem o salário médio de: R$"+math.arredondar(mediaSalario, 2)+"\n")
		 escreva("Essa população tem em média: "+math.arredondar(mediaFilhos, 2)+" filho(s)\n")
		 escreva(" \n")
		 escreva("Quem tem o maior salário, recebe R$"+maiorSalario+"\n")
		 escreva("O percentual de pessoas que recebem até R$100 é de "+math.arredondar(percentSalario, 2)+"% \n")

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 842; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */