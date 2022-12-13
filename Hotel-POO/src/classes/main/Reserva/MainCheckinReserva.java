package classes.main.Reserva;

import java.util.Date;

import classes.BO.ReservaBO;
import classes.DTO.Reserva;

public class MainCheckinReserva {

	public static void main(String[] args) {
		ReservaBO reservaBO = new ReservaBO();
		Date date = new Date();
		
		Reserva reserva = new Reserva(17,date,null);
		
		reservaBO.checkin(reserva);

	}

}
