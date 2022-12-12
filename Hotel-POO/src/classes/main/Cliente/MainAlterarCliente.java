package classes.main.Cliente;

import classes.BO.ClienteBO;
import classes.DTO.Cliente;

public class MainAlterarCliente {

	public static void main(String[] args) {
		ClienteBO clienteBO = new ClienteBO();
		Cliente cliente = new Cliente(2,"Cleber","123123","Claudio@gmail",true);
		
		clienteBO.alterar(cliente);
		cliente = clienteBO.procurarPorId(cliente);
		System.out.println(cliente);

	}

}
