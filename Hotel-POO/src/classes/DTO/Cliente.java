package classes.DTO;

public class Cliente extends Pessoa{
	private int idCliente;
	
	public Cliente(int idCliente, String nome, String cpf, String email, boolean ativo) {
		super(email, cpf, nome, ativo);
		this.idCliente = idCliente;
	}

	public Cliente(String nome, String cpf, String email, boolean ativo) {
		super(nome, cpf, email, ativo);
	}

	public Cliente(int idCliente) {
		super();
		this.idCliente = idCliente;
	}
	
	public Cliente() {
		super();
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Cliente [idCliente=");
		builder.append(idCliente);
		builder.append("]");
		return builder.toString();
	}
	
}
