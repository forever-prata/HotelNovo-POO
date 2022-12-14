package classes.DTO;

public class Funcionario extends Pessoa{
	private int numeroRegistro;
	
	public Funcionario(int numeroRegistro, String nome, String cpf, String email, boolean ativo) {
		super(email, cpf, nome, ativo);
		this.numeroRegistro = numeroRegistro;
	}

	public Funcionario(String nome, String cpf, String email, boolean ativo) {
		super(nome, cpf, email, ativo);
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Funcionario [numeroRegistro=");
		builder.append(numeroRegistro);
		builder.append("]");
		return builder.toString();
	}
}
