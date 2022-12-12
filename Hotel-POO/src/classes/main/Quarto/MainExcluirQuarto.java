package classes.main.Quarto;

import classes.BO.QuartoBO;
import classes.DTO.Quarto;

public class MainExcluirQuarto {

	public static void main(String[] args) {
		QuartoBO quartoBO = new QuartoBO();
		Quarto quarto = new Quarto(1);
		if (quartoBO.excluir(quarto))
			System.out.println("Excluido com Sucesso");
		else
			System.out.println("Erro ao Excluir");


	}

}
