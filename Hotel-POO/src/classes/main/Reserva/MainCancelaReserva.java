package classes.main.Reserva;

import classes.BO.ReservaBO;
import classes.DTO.Reserva;

public class MainCancelaReserva {

	public static void main(String[] args) {
		Reserva reserva = new Reserva(10);
		
		ReservaBO reservaBO = new ReservaBO();
		
		System.out.println("Cancelado: R$" +reservaBO.Cancela(reserva)+" De multa");

	}

}
