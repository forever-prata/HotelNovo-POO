package classes.main.aFazTudo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import classes.BO.ReservaBO;
import classes.DTO.Cliente;
import classes.DTO.Funcionario;
import classes.DTO.Quarto;
import classes.DTO.Reserva;

public class MainReserva {

	public static void main(String[] args) {
		ReservaBO reservaBO = new ReservaBO();
		
		//Pesquisa Todos
		System.out.println("Todas as Reservas");
		List<Reserva> lista = new ArrayList<Reserva>();
		lista = reservaBO.pesquisarTodos();	
		for (Reserva reserva: lista) {
			System.out.println(reserva.toString());
		}
		
		//Pesquisa por mes
		System.out.println("Todas as reservas do mes 11");
		List<Reserva> listaMes = new ArrayList<Reserva>();
		int i = 11;
		
		listaMes = reservaBO.pesquisarMes(i);	
		for (Reserva reserva: listaMes) {
			System.out.println(reserva.toString());
		}
		
		//Inserir
		Cliente cliente = new Cliente(2);
		Funcionario funcionario = new Funcionario(2);
		Quarto quarto = new Quarto(1);
		
		Reserva reserva = new Reserva(cliente,funcionario,quarto,300.00,4,false);
		
		if (reservaBO.inserir(reserva)) {
			System.out.println("Inserido com Sucesso");
		}else{
			System.out.println("Erro ao Inserir");
		}
		System.out.println();
		
		//Alterar e busca por ID
		Cliente clienteAlt = new Cliente(2);
		Funcionario funcionarioAlt = new Funcionario(3);
		Quarto quartoAlt = new Quarto(1);
				
		Calendar c = Calendar.getInstance();
		c.set(Calendar.DAY_OF_MONTH, 20);
		c.set(Calendar.MONTH, 10); // Janeiro = 0
		c.set(Calendar.YEAR, 2022);
		
		Date saida = c.getTime();
		
		c.set(Calendar.DAY_OF_MONTH, 25);
		c.set(Calendar.MONTH, 10);
		c.set(Calendar.YEAR, 2022);
		
		Date entrada = c.getTime();
		
		Reserva reservaAlt = new Reserva(8,clienteAlt,funcionarioAlt,quartoAlt,150.00,5,entrada,saida,false);
		
		reservaBO.alterar(reservaAlt);
		System.out.println("Reserva Alterada");
		reservaAlt = reservaBO.procuraPorId(reservaAlt);
		System.out.println(reservaAlt);
		
		//Checkin e busca por ID
		Date dateIn = new Date();
		
		Reserva reservaIn = new Reserva(19,dateIn,null);
		
		reservaBO.checkin(reservaIn);
		System.out.println("Checkin Feito");
		reservaIn = reservaBO.procuraPorId(reservaIn);
		System.out.println(reservaIn);
		
		//Checkout e busca por ID
		Date dateOut = new Date();
		
		Reserva reservaOut = new Reserva(19,null,dateOut);
		
		reservaBO.checkout(reservaOut);
		System.out.println("Checkout Feito");
		reservaOut = reservaBO.procuraPorId(reservaOut);
		System.out.println(reservaOut);
		
		//Exclui
		Reserva reservaDel = new Reserva(14);
		if (reservaBO.excluir(reservaDel)) {
			System.out.println("Excluido com Sucesso");
		}else{
			System.out.println("Erro ao Excluir");
		}
		
		//Cancela
		Reserva reservaCanc = new Reserva(19);
		
		System.out.println("Cancelado: R$" +reservaBO.Cancela(reservaCanc)+" De multa");

		
	}

}
