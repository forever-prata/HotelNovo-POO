package classes.main.Funcionario;

import classes.BO.FuncionarioBO;
import classes.DTO.Funcionario;

public class MainInserirFuncionario {

	public static void main(String[] args) {
		FuncionarioBO funcionarioBO = new FuncionarioBO();
		Funcionario funcionario = new Funcionario("Pedro","0111","Pedro@gmail",true);
		
		if (funcionarioBO.inserir(funcionario))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
	}

}
