package classes.DTO;

public class Quarto {
	private int numero;
	private boolean ocupacao;
	public Quarto() {
		
	}
	public Quarto(int numero) {
		setNumero(numero);
	}
	public Quarto(boolean ocupacao) {
		setOcupacao(ocupacao);
	}
	public Quarto(int numero, boolean ocupacao) {
		setNumero(numero);
		setOcupacao(ocupacao);
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public boolean isOcupado() {
		return ocupacao;
	}
	public void setOcupacao(boolean ocupacao) {
		this.ocupacao = ocupacao;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Quarto [numero=");
		builder.append(numero);
		builder.append(", ocupacao=");
		builder.append(ocupacao);
		builder.append("]");
		return builder.toString();
	}
}