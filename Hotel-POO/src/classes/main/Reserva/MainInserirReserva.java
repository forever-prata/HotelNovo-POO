package classes.main.Reserva;

import classes.BO.ReservaBO;
import classes.DTO.Cliente;
import classes.DTO.Funcionario;
import classes.DTO.Quarto;
import classes.DTO.Reserva;

public class MainInserirReserva {

	public static void main(String[] args) {
		Cliente cliente = new Cliente(1,"Clarber","12","Claudio@gmail",true);
		Funcionario funcionario = new Funcionario(2,"Pedro","0111","Pedro@gmail",true);
		Quarto quarto = new Quarto(1,false);
		
		Reserva reserva = new Reserva(cliente,funcionario,quarto,300.00,4,false);
		
		ReservaBO reservaBO = new ReservaBO();
		
		reservaBO.inserir(reserva);

	}

}
