package classes.main.Reserva;

import java.util.ArrayList;
import java.util.List;

import classes.BO.ReservaBO;
import classes.DTO.Reserva;

public class MainPesquisaTodos {

	public static void main(String[] args) {
		ReservaBO reservaBO = new ReservaBO();
		List<Reserva> lista = new ArrayList<Reserva>();
		lista = reservaBO.pesquisarTodos();	
		for (Reserva reserva: lista) {
			System.out.println(reserva.toString());
		}

	}

}
