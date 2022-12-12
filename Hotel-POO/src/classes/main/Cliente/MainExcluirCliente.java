package classes.main.Cliente;

import classes.BO.ClienteBO;
import classes.DTO.Cliente;

public class MainExcluirCliente {

	public static void main(String[] args) {
		ClienteBO clienteBO = new ClienteBO();
		Cliente cliente = new Cliente(1);
		
		if (clienteBO.excluir(cliente))
			System.out.println("Alvo Eliminado");
		else
			System.out.println("Erro ao Excluir");
	}

}
