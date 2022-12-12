package classes.main.Quarto;

import classes.BO.QuartoBO;
import classes.DTO.Quarto;

public class MainAlterarQuarto {

	public static void main(String[] args) {
		QuartoBO quartoBO = new QuartoBO();
		Quarto quarto = new Quarto(2,true);
		
		quartoBO.alterar(quarto);
		quarto = quartoBO.procurarPorNumero(quarto);
		System.out.println(quarto);

	}
}
