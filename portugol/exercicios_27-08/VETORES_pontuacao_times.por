programa
{
	
	funcao inicio()
	{

		//Variáveis
		cadeia times[4]
		times[0] = "SPFC       "
		times[1] = "SANTOS     "
		times[2] = "PALMEIRAS  "
		times[3] = "CORINTHIANS"

		inteiro pontos[4]
		pontos[0] = 0
		pontos[1] = 0
		pontos[2] = 0
		pontos[3] = 0
	
		caracter resultado = 'x'

		//entrada - processamento
		para(inteiro x=1; x<=3; x++){
			escreva("Rodada "+x+"\n")
			
			para(inteiro i=0; i<4; i++){
				escreva(times[i]+" G-ganhou, E-empatou ou P-perdeu : ")
				leia(resultado)
				
				enquanto(resultado != 'g' e resultado!= 'e' e resultado!='p'){
					escreva("opção invalida, é G, P ou  E, pode ser? Tente de novo : ")
					leia(resultado)	
				}
				
				se(resultado == 'g' ou  resultado =='G'){
					pontos[i] = pontos[i] + 3
				}
				senao se(resultado == 'p'){
					pontos[i] = pontos[i] + 0
				}
				senao se(resultado == 'e'){
					pontos[i] = pontos[i] + 1
				}
				senao{
					escreva("opcao invalida!!")
				}
			}
			escreva("\n")
			
		}

		

		//saida
		escreva("TABELA DE PONTOS ATUAIS\n")
		escreva("TIME\t\t\tPONTOS\n")
		para (inteiro x=0; x<4; x++){
			escreva(times[x]+"\t\t"+pontos[x]+"\n")	
		}
		
		

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 676; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {pontos, 14, 10, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */