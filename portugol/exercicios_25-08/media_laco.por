programa
{
	
	funcao inicio()
	{

		//variável
		cadeia nomeAluno
		caracter pronome
		real nota, total, media
		inteiro contadora

		//entrada
		escreva("Digite seu nome: ")
		leia(nomeAluno)

		escreva("Digite como você que ser chamadx ('m' - masculino, 'f' - feminino, 'n' - neutro): ")
		leia(pronome)

		//processamento
		total = 0.0
		contadora = 0
		para(inteiro x=1; x<=5; x++){
			contadora = contadora + 1
			escreva("Digite sua "+contadora+"º nota: ")
			leia(nota)

			total = total + nota		
		}
		
		media = (total / 5)

		se(media < 5 e pronome == 'm'){
			escreva("ELE teve a média de "+media+" e ficará de recuperação!")
		}
		senao se(media < 5 e pronome == 'f'){
			escreva("ELA teve a média de "+media+" e ficará de recuperação!")
		}
		senao se(media < 5 e pronome == 'n'){
			escreva("ELU teve a média de "+media+" e ficará de recuperação!")
		}
		senao se(media >= 5 e pronome == 'm'){
		     escreva("ELE teve a média de "+media+" e está aprovado!")
		}
		senao se(media >= 5 e pronome == 'f'){
			escreva("ELA teve a média de "+media+" e está aprovada!")
		}
		senao se(media >= 5 e pronome == 'n'){
			escreva("ELU teve a média de "+media+" e está aprovade!")
		}
		senao {
			escreva("Houve alguma informação digitada errada")
		}	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 453; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */