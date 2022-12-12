package classes.main.Quarto;

import java.util.ArrayList;
import java.util.List;

import classes.BO.QuartoBO;
import classes.DTO.Quarto;

public class MainPesquisaTodosQuarto {
	
public static void main(String[] args) {
		
		QuartoBO quartoBO = new QuartoBO();
		List<Quarto> lista = new ArrayList<Quarto>();
		lista = quartoBO.pesquisarTodos();	
		for (Quarto quarto : lista) {
			System.out.println(quarto.toString());
		}
	
	}
	
}
