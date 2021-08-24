programa
{
	
	funcao inicio()
	{
		/*
		 * 5) A Secretaria de Meio Ambiente que controla o índice de poluição mantém 3 grupos de
			indústrias que são altamente poluentes do meio ambiente. O índice de poluição aceitável
			varia de 0,05 até 0,25. Se o índice sobe para 0,3 as indústrias do 1º grupo são intimadas a
			suspenderem suas atividades, se o índice crescer para 0,4 as industrias do 1º e 2º grupo são
			intimadas a suspenderem suas atividades, se o índice atingir 0,5 todos os grupos devem ser
			notificados a paralisarem suas atividades. Faça um sistema que leia o índice de poluição
			medido e emita a notificação adequada aos diferentes grupos de empresas.
		 */

		 //variáveis
		 inteiro gpEmpresa
		 real nvPoluicao
		 
		 //entrada
		 escreva("Digite o grupo da empresa de 1 à 3: ")
		 leia(gpEmpresa)
		 escreva("Digite o nível de poluíção: ")
		 leia(nvPoluicao)
		 
		 //processamento
		 se(nvPoluicao >= 0.05 e nvPoluicao <= 0.25){
		 	escreva("ìndice de poluíção aceitável para todos os grupos")
		 }
		 senao se(nvPoluicao >= 0.3 e nvPoluicao < 0.4 e gpEmpresa == 1){
		 	escreva("O nível de poluição é de "+nvPoluicao+", e as empresas do 1º grupo serão intimadas")
		 }
		 senao se(nvPoluicao >= 0.4 e nvPoluicao < 0.5 e gpEmpresa == 1 ou nvPoluicao >= 0.4 e nvPoluicao < 0.5 e gpEmpresa == 2){
		 	escreva("O nível de poluição é de "+nvPoluicao+", e as empresas do 1º e 2º grupo serão intimadas")
		 }
		 senao se(nvPoluicao >= 0.5 e gpEmpresa == 1 ou nvPoluicao >= 0.5 e gpEmpresa == 2 ou nvPoluicao >= 0.5 e gpEmpresa == 3){
		 	escreva("O nível de poluíção é de "+nvPoluicao+", todas as empresas serão intimadas")
		 }
		 senao se(gpEmpresa == 1 ou gpEmpresa == 2 ou gpEmpresa == 3){
		 	escreva("A empresa do "+gpEmpresa+"º grupo não será intimada")
		 }
		 senao{
		 	escreva("Você digitou um dos valores inválidos")
		 }
		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1703; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */