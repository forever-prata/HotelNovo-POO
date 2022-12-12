package classes.DTO;

import java.util.Date;

public class Reserva {
	private int idReserva;
	private Cliente cliente;
	private Funcionario funcionario;
	private Quarto quarto;
	private double valorDiaria;
	private int dias;
	private Date entrada;
	private Date saida;
	private boolean cancelada;
	
	public Reserva(int idReserva, Cliente cliente, Funcionario funcionario, Quarto quarto, double valorDiaria, int dias,
			Date entrada, Date saida, boolean cancelada) {
		super();
		this.idReserva = idReserva;
		this.cliente = cliente;
		this.funcionario = funcionario;
		this.quarto = quarto;
		this.valorDiaria = valorDiaria;
		this.dias = dias;
		this.entrada = entrada;
		this.saida = saida;
		this.cancelada = cancelada;
	}
	
	public Reserva(Cliente cliente, Funcionario funcionario, Quarto quarto, double valorDiaria, int dias, Date entrada,
			Date saida, boolean cancelada) {
		super();
		this.cliente = cliente;
		this.funcionario = funcionario;
		this.quarto = quarto;
		this.valorDiaria = valorDiaria;
		this.dias = dias;
		this.entrada = entrada;
		this.saida = saida;
		this.cancelada = cancelada;
	}
	
	public Reserva(Date entrada, Date saida) {
		super();
		this.entrada = entrada;
		this.saida = saida;
	}
	
	public Reserva(int idReserva, Date entrada, Date saida) {
		super();
		this.idReserva = idReserva;
		this.entrada = entrada;
		this.saida = saida;
	}

	public Reserva() {
		super();
	}

	public int getIdReserva() {
		return idReserva;
	}
	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public Quarto getQuarto() {
		return quarto;
	}
	public void setQuarto(Quarto quarto) {
		this.quarto = quarto;
	}
	public double getValorDiaria() {
		return valorDiaria;
	}
	public void setValorDiaria(double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}
	public int getDias() {
		return dias;
	}
	public void setDias(int dias) {
		this.dias = dias;
	}
	public Date getEntrada() {
		return entrada;
	}
	public void setEntrada(Date entrada) {
		this.entrada = entrada;
	}
	public Date getSaida() {
		return saida;
	}
	public void setSaida(Date saida) {
		this.saida = saida;
	}
	public boolean isCancelada() {
		return cancelada;
	}
	public void setCancelada(boolean cancelada) {
		this.cancelada = cancelada;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Reserva [idReserva=");
		builder.append(idReserva);
		builder.append(", cliente=");
		builder.append(cliente);
		builder.append(", funcionario=");
		builder.append(funcionario);
		builder.append(", quarto=");
		builder.append(quarto);
		builder.append(", valorDiaria=");
		builder.append(valorDiaria);
		builder.append(", dias=");
		builder.append(dias);
		builder.append(", entrada=");
		builder.append(entrada);
		builder.append(", saida=");
		builder.append(saida);
		builder.append(", cancelada=");
		builder.append(cancelada);
		builder.append("]");
		return builder.toString();
	}
}
