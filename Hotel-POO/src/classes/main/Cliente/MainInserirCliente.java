package classes.main.Cliente;

import classes.BO.ClienteBO;
import classes.DTO.Cliente;

public class MainInserirCliente {

	public static void main(String[] args) {
		ClienteBO clienteBO = new ClienteBO();
		Cliente cliente = new Cliente("Clarber","12","Claudio@gmail",true);
		
		if (clienteBO.inserir(cliente))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
	}

}
