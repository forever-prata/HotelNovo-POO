package classes.main.Reserva;

import java.util.Date;

import classes.BO.ReservaBO;
import classes.DTO.Reserva;

public class MainCheckoutReserva {

	public static void main(String[] args) {
		ReservaBO reservaBO = new ReservaBO();
		Date date = new Date();
		
		Reserva reserva = new Reserva(17,null,date);
		
		reservaBO.checkout(reserva);

	}

}
