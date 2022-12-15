package classes.main.aFazTudo;

import java.util.ArrayList;
import java.util.List;

import classes.BO.QuartoBO;
import classes.DTO.Quarto;

public class MainQuarto {

	public static void main(String[] args) {
		QuartoBO quartoBO = new QuartoBO();
		
		//Pesquisar Todos
		List<Quarto> lista = new ArrayList<Quarto>();
		lista = quartoBO.pesquisarTodos();
		System.out.println("Todos os Quartos");
		for (Quarto quarto : lista) {
			System.out.println(quarto.toString());
		}
		System.out.println();
		
		//Inserir
		Quarto quartoInserir = new Quarto(false);
		
		if (quartoBO.inserir(quartoInserir)) {
			System.out.println("Inserido com Sucesso");
		}else{
			System.out.println("Erro ao Inserir");
		}
		System.out.println();
		
		//Alterar e Pesquisa por Numero
		Quarto quartoAlterar = new Quarto(1,true);
		
		quartoBO.alterar(quartoAlterar);
		quartoAlterar = quartoBO.procurarPorNumero(quartoAlterar);
		System.out.println("Quarto Alterado");
		System.out.println(quartoAlterar);
		System.out.println();
		
		//Ocupar e Pesquisa por Numero
		Quarto quartoOcupar = new Quarto(1);
		
		quartoBO.ocupar(quartoOcupar);
		quartoOcupar = quartoBO.procurarPorNumero(quartoOcupar);
		System.out.println("Quarto Ocupado");
		System.out.println(quartoOcupar);
		System.out.println();

		//Desocupar e Pesquisa por Numero
		Quarto quartoDesocupar = new Quarto(1);
		
		quartoBO.desocupar(quartoDesocupar);
		quartoDesocupar = quartoBO.procurarPorNumero(quartoDesocupar);
		System.out.println("Quarto Desocupado");
		System.out.println(quartoDesocupar);
		System.out.println();
		
		//Excluir
		Quarto quartoExcluir = new Quarto(2);
		if (quartoBO.excluir(quartoExcluir))
			System.out.println("Excluido com Sucesso");
		else
			System.out.println("Erro ao Excluir");

	}

}
