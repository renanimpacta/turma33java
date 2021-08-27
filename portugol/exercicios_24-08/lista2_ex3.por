programa
{
	inclua biblioteca Matematica --> math
	funcao inicio()
	{
		/*
		 * 3) Desenvolva um sistema em que:
		Leia 4 (quatro) números;
		Calcule o quadrado de cada um;
		Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
		Caso contrário, imprima os valores lidos e seus respectivos quadrados.
		 */

		//variavel
		real num1, num2, num3, num4
		real quadradoNum1, quadradoNum2, quadradoNum3, quadradoNum4
		
		//entrada
		escreva("Digite o número 1: ")
		leia(num1)
		escreva("Digite o número 2: ")
		leia(num2)
		escreva("Digite o número 3: ")
		leia(num3)
		escreva("Digite o número 4: ")
		leia(num4)
		
		//processamento
		 quadradoNum1 = math.potencia(num1, 2)
		 quadradoNum2 = math.potencia(num2, 2)
		 quadradoNum3 = math.potencia(num3, 2)
		 quadradoNum4 = math.potencia(num4, 2)

		 se(quadradoNum3 >= 1000){
		 	escreva("O quadrado de "+num3+" é: "+quadradoNum3)
		 }
		 senao{
		 	escreva("O quadrado de "+num1+" é: "+quadradoNum1+"\n")
		 	escreva("O quadrado de "+num2+" é: "+quadradoNum2+"\n")
		 	escreva("O quadrado de "+num3+" é: "+quadradoNum3+"\n")
		 	escreva("O quadrado de "+num4+" é: "+quadradoNum4)
		 }
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 365; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */