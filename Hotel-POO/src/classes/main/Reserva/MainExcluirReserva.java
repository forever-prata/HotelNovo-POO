package classes.main.Reserva;

import classes.BO.ReservaBO;
import classes.DTO.Reserva;

public class MainExcluirReserva {

	public static void main(String[] args) {
		ReservaBO reservaBO = new ReservaBO();
		Reserva reserva = new Reserva(16);
		
		reservaBO.excluir(reserva);


	}

}
