package classes.main.Funcionario;

import classes.BO.FuncionarioBO;
import classes.DTO.Funcionario;

public class MainAlterarFuncionario {

	public static void main(String[] args) {
		FuncionarioBO funcionarioBO = new FuncionarioBO();
		Funcionario funcionario = new Funcionario(1,"Claudio","0987","Claudio@gmail",true);
		
		funcionarioBO.alterar(funcionario);
		funcionario = funcionarioBO.procurarPorId(funcionario);
		System.out.println(funcionario);

	}

}
