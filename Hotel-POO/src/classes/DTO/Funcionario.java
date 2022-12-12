package classes.DTO;

public class Funcionario {
	private int numeroRegistro;
	private String nome;
	private String cpf;
	private String email;
	private boolean ativo;
	
	public Funcionario(int numeroRegistro, String nome, String cpf, String email, boolean ativo) {
		super();
		this.numeroRegistro = numeroRegistro;
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.ativo = ativo;
	}

	public Funcionario(String nome, String cpf, String email, boolean ativo) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.ativo = ativo;
	}

	public Funcionario(int numeroRegistro) {
		super();
		this.numeroRegistro = numeroRegistro;
	}

	public Funcionario() {
		super();
	}

	public int getNumeroRegistro() {
		return numeroRegistro;
	}

	public void setNumeroRegistro(int numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
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
		builder.append("Funcionario [numeroRegistro=");
		builder.append(numeroRegistro);
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
