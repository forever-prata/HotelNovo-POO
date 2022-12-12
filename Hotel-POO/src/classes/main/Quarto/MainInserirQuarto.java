package classes.main.Quarto;

import classes.BO.QuartoBO;
import classes.DTO.Quarto;

public class MainInserirQuarto {

	public static void main(String[] args) {
		
		QuartoBO quartoBO = new QuartoBO();
		Quarto quarto = new Quarto(false);
		
		if (quartoBO.inserir(quarto))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		
		quarto = new Quarto(true);
		if (quartoBO.inserir(quarto))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
	}
}
