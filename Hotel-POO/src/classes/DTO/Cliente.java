package classes.DTO;

public class Cliente {
	private int idCliente;
	private String nome;
	private String cpf;
	private String email;
	private boolean ativo;
	
	public Cliente(int idCliente, String nome, String cpf, String email, boolean ativo) {
		super();
		this.idCliente = idCliente;
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.ativo = ativo;
	}

	public Cliente(String nome, String cpf, String email, boolean ativo) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.ativo = ativo;
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cliente [idCliente=");
		builder.append(idCliente);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", cpf=");
		builder.append(cpf);
		builder.append(", email=");
		builder.append(email);
		builder.append(", ativo=");
		builder.append(ativo);
		builder.append("]");
		return builder.toString();
	}
	
}
