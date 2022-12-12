package classes.main.Funcionario;

import classes.BO.FuncionarioBO;
import classes.DTO.Funcionario;

public class MainExcluirFuncionario {

	public static void main(String[] args) {
		FuncionarioBO funcionarioBO = new FuncionarioBO();
		Funcionario funcionario = new Funcionario(1);
		
		if (funcionarioBO.excluir(funcionario))
			System.out.println("Alvo Eliminado");
		else
			System.out.println("Erro ao Excluir");
	}

}
