package classes.main.Reserva;

import java.util.Calendar;
import java.util.Date;

import classes.BO.ReservaBO;
import classes.DTO.Cliente;
import classes.DTO.Funcionario;
import classes.DTO.Quarto;
import classes.DTO.Reserva;

public class MainAlterarReserva {

	public static void main(String[] args) {
		Cliente cliente = new Cliente(1,"Cleber","12","Claudio@gmail",true);
		Funcionario funcionario = new Funcionario(2,"Pedro","0111","Pedro@gmail",true);
		Quarto quarto = new Quarto(1,false);
				
		Calendar c = Calendar.getInstance();
		c.set(Calendar.DAY_OF_MONTH, 20);
		c.set(Calendar.MONTH, 10); // Janeiro = 0
		c.set(Calendar.YEAR, 2022);
		
		Date saida = c.getTime();
		
		c.set(Calendar.DAY_OF_MONTH, 25);
		c.set(Calendar.MONTH, 10);
		c.set(Calendar.YEAR, 2022);
		
		Date entrada = c.getTime();
		
		Reserva reserva = new Reserva(8,cliente,funcionario,quarto,300.00,5,entrada,saida,false);
		
		ReservaBO reservaBO = new ReservaBO();
		
		reservaBO.alterar(reserva);

	}

}
