programa
{
	inclua biblioteca Util
	funcao inicio()
	{
		/*
		 * Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
			a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
			das matrizes N1 e N2;
			b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
			posição das matrizes N1 e N2.
		 */

		 //variaveis
		inteiro n1[4][6], n2[4][6], m1[4][6], m2[4][6]
		inteiro linha, coluna

		//entrada e processamento
		para(linha=0; linha<4; linha++){
			para(coluna=0; coluna<6; coluna++){
				n1[linha][coluna] = sorteia(0,10)
				n2[linha][coluna] = sorteia(0,10)

				m1[linha][coluna] = n1[linha][coluna] + n2[linha][coluna]
				m2[linha][coluna] = n1[linha][coluna] - n2[linha][coluna]
				
			}
		}

		//saida
		para(linha=0; linha<4; linha++){
			//N1
			escreva("N1")
			para(coluna=0; coluna<6; coluna++){
				escreva("["+n1[linha][coluna]+"]")
			}
			escreva("\n")
		}

		escreva("\n")
		
		para(linha=0; linha<4; linha++){
			//N2
			escreva("N2")
			para(coluna=0; coluna<6; coluna++){
				escreva("["+n2[linha][coluna]+"]")
			}
			escreva("\n")
		}

		escreva("\n")
		
		para(linha=0; linha<4; linha++){
			//M1
			escreva("M1")
			para(coluna=0; coluna<6; coluna++){
				escreva("["+m1[linha][coluna]+"]")
			}
			escreva("\n")
		}

		escreva("\n")
		
		para(linha=0; linha<4; linha++){
			//M2
			escreva("M2")
			para(coluna=0; coluna<6; coluna++){
				escreva("["+m2[linha][coluna]+"]")
			}
			escreva("\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 627; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {n1, 15, 10, 2}-{n2, 15, 20, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */