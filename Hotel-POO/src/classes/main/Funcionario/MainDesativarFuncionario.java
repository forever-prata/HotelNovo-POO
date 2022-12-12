package classes.main.Funcionario;

import classes.BO.FuncionarioBO;
import classes.DTO.Funcionario;

public class MainDesativarFuncionario {

	public static void main(String[] args) {
		FuncionarioBO funcionarioBO = new FuncionarioBO();
		Funcionario funcionario = new Funcionario(1);
		
		funcionarioBO.desativar(funcionario);
		funcionario = funcionarioBO.procurarPorId(funcionario);
		System.out.println(funcionario);

	}

}
