package classes.main.aFazTudo;

import java.util.ArrayList;
import java.util.List;

import classes.BO.ClienteBO;
import classes.DTO.Cliente;

public class MainCliente {

	public static void main(String[] args) {
		ClienteBO clienteBO = new ClienteBO();
		
		//Procurar todos
		List<Cliente> lista = new ArrayList<Cliente>();
		lista = clienteBO.pesquisarTodos();	
		for (Cliente cliente : lista) {
			System.out.println(cliente.toString());
		}
		
		//Inserir
		Cliente clienteinse = new Cliente("Novo","12","Novo@gmail",true);
		
		if (clienteBO.inserir(clienteinse))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");

		//Alterar e Procurar
		Cliente clienteAlt = new Cliente(2,"Novo","123123","EmailNovoo@gmail",true);
		
		clienteBO.alterar(clienteAlt);
		clienteAlt = clienteBO.procurarPorId(clienteAlt);
		System.out.println(clienteAlt);
		
		//Ativar e Procurar
		Cliente clienteAtv = new Cliente(2);
		
		clienteBO.ativar(clienteAtv);
		clienteAtv = clienteBO.procurarPorId(clienteAtv);
		System.out.println(clienteAtv);
		
		//Desativar e Procurar
		Cliente clienteDes = new Cliente(2);
		
		clienteBO.ativar(clienteDes);
		clienteDes = clienteBO.procurarPorId(clienteDes);
		System.out.println(clienteDes);
		
		//Excluir
		Cliente clienteDel = new Cliente(1);
		
		if (clienteBO.excluir(clienteDel))
			System.out.println("Alvo Eliminado");
		else
			System.out.println("Erro ao Excluir");
	}
}
