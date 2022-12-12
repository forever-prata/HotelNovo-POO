package classes.main.Quarto;

import classes.BO.QuartoBO;
import classes.DTO.Quarto;

public class MainOcuparQuarto {

	public static void main(String[] args) {
		QuartoBO quartoBO = new QuartoBO();
		Quarto quarto= new Quarto(1);
		
		quartoBO.ocupar(quarto);
		quarto = quartoBO.procurarPorNumero(quarto);
		System.out.println(quarto);
	}

}
