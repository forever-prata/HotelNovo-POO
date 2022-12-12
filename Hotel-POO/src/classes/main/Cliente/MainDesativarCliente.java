package classes.main.Cliente;

import classes.BO.ClienteBO;
import classes.DTO.Cliente;

public class MainDesativarCliente {

	public static void main(String[] args) {
		ClienteBO clienteBO = new ClienteBO();
		Cliente cliente = new Cliente(1);
		
		clienteBO.desativar(cliente);
		cliente = clienteBO.procurarPorId(cliente);
		System.out.println(cliente);

	}

}
