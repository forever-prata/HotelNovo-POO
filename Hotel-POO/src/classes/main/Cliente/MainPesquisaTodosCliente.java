package classes.main.Cliente;

import java.util.ArrayList;
import java.util.List;

import classes.BO.ClienteBO;
import classes.DTO.Cliente;

public class MainPesquisaTodosCliente {

	public static void main(String[] args) {
		ClienteBO clienteBO = new ClienteBO();
		List<Cliente> lista = new ArrayList<Cliente>();
		lista = clienteBO.pesquisarTodos();	
		for (Cliente cliente : lista) {
			System.out.println(cliente.toString());
		}

	}

}
