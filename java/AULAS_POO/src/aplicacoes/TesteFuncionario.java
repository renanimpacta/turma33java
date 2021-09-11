package aplicacoes;

import classes.Funcionario;
import classes.Terceiro;

public class TesteFuncionario {
	public static void main(String[] args) {
		
		Funcionario func1 = new Funcionario("123","João", 48, 20.00);
		Terceiro terc1 = new Terceiro("321","Maria", 48, 20.00, 500.00);
		
		System.out.println(func1.salario());
		System.out.println(terc1.salario());
		
	}
}
