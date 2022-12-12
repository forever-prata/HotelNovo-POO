package classes.main.Funcionario;

import java.util.ArrayList;
import java.util.List;

import classes.BO.FuncionarioBO;
import classes.DTO.Funcionario;

public class MainPesquisaTodosFuncionario {

	public static void main(String[] args) {
		FuncionarioBO funcionarioBO = new FuncionarioBO();
		List<Funcionario> lista = new ArrayList<Funcionario>();
		lista = funcionarioBO.pesquisarTodos();	
		for (Funcionario funcionario : lista) {
			System.out.println(funcionario.toString());
		}

	}

}
