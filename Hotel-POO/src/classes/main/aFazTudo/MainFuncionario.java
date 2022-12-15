package classes.main.aFazTudo;

import java.util.ArrayList;
import java.util.List;

import classes.BO.FuncionarioBO;
import classes.DTO.Funcionario;

public class MainFuncionario {

	public static void main(String[] args) {
		FuncionarioBO funcionarioBO = new FuncionarioBO();
		
		//Pesquisa Todos
		List<Funcionario> lista = new ArrayList<Funcionario>();
		lista = funcionarioBO.pesquisarTodos();	
		for (Funcionario funcionario : lista) {
			System.out.println(funcionario.toString());
		}
		
		//Inserir
		Funcionario funcionario = new Funcionario("Novo","0111","novo@gmail",true);
		
		if (funcionarioBO.inserir(funcionario)) {
			System.out.println("Inserido com Sucesso");
		}else {
			System.out.println("Erro ao Inserir");
		}
		System.out.println();
		
		//Ativar e Procurar por ID
		Funcionario funcionarioAtivar = new Funcionario(3);
		
		funcionarioBO.ativar(funcionarioAtivar);
		funcionario = funcionarioBO.procurarPorId(funcionarioAtivar);
		System.out.println("Funcionario Ativado");
		System.out.println(funcionarioAtivar);
		System.out.println();
		
		//Desativar e Procurar por ID
		Funcionario funcionarioDesa = new Funcionario(3);
		
		funcionarioBO.desativar(funcionarioDesa);
		funcionarioDesa = funcionarioBO.procurarPorId(funcionarioDesa);
		System.out.println("Funcionario Desativado");
		System.out.println(funcionarioDesa);
		System.out.println();
		
		
		//Alterar e Procurar por ID
		Funcionario funcionarioAlt = new Funcionario(3,"Novo","0987","EmailDiferente@gmail",true);
		
		funcionarioBO.alterar(funcionarioAlt);
		funcionarioAlt = funcionarioBO.procurarPorId(funcionarioAlt);
		System.out.println(funcionarioAlt);
		
		//Excluir
		Funcionario funcionarioDel = new Funcionario(1);
		
		if (funcionarioBO.excluir(funcionarioDel))
			System.out.println("Alvo Eliminado");
		else
			System.out.println("Erro ao Excluir");
	}

}
