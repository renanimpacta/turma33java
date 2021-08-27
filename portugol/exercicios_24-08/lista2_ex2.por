programa
{
	
	funcao inicio()
	{
		/*
		 * 2) Elabore um sistema que leia as variáveis C e N, respectivamente código e número de
			horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00
			por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento
			armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de
			trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário
			excedente.
		 */


		 inteiro C //CódigoDoTrabalhador
		 real N /*NúmeroDeHoras*/, E/*PagamentoExcedido*/, horaExcedente, salario, salarioTotal
		 
		 //entrada
		 escreva("Digite o código do operário: ")
		 leia(C)
		 escreva("Digite o número de horas trabalhadas: ")
		 leia(N)
		 
		 //processamento
		 se(N > 50){
		 	salario = 50 * 10.0
		 	horaExcedente = N - 50
		 	E = horaExcedente * 20.0
		 	salarioTotal = salario + E
		 	escreva("O funcionário "+C+" trabalhou "+horaExcedente+"hrs a mais, receberá R$"+E+" de salário excedente e R$"+salarioTotal+" de salário total")
		 }
		 senao{
		 	salario = N * 10.0
		 	escreva("O funcionário "+C+" receberá o salário total de R$"+salario)
		 }
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 505; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */