package classes.main.Reserva;

import java.util.ArrayList;
import java.util.List;

import classes.BO.ReservaBO;
import classes.DTO.Reserva;

public class MainPesquisaMes {

	public static void main(String[] args) {
		ReservaBO reservaBO = new ReservaBO();
		List<Reserva> lista = new ArrayList<Reserva>();
		int i = 11;
		
		lista = reservaBO.pesquisarMes(i);	
		for (Reserva reserva: lista) {
			System.out.println(reserva.toString());
		}


	}

}
