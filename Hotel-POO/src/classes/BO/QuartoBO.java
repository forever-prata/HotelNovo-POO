package classes.BO;

import classes.DTO.Quarto;
import classes.DAO.QuartoDAO;
import java.util.List;

public class QuartoBO {

    public boolean inserir(Quarto quarto){
            QuartoDAO quartoDAO = new QuartoDAO();
            return quartoDAO.inserir(quarto);
    }
    public boolean alterar(Quarto quarto){
        QuartoDAO QuartosDAO = new QuartoDAO();
        return QuartosDAO.alterar(quarto);
    }
    public boolean excluir(Quarto quarto){
        QuartoDAO QuartosDAO = new QuartoDAO();
        return QuartosDAO.excluir(quarto);
    }
    public boolean desocupar(Quarto quarto){
        QuartoDAO QuartosDAO = new QuartoDAO();
        return QuartosDAO.desocupar(quarto);
    }
    public boolean ocupar(Quarto quarto){
        QuartoDAO QuartosDAO = new QuartoDAO();
        return QuartosDAO.ocupar(quarto);
    }
    public Quarto procurarPorNumero(Quarto quarto){
        QuartoDAO QuartosDAO = new QuartoDAO();
        return QuartosDAO.procuraPorNumero(quarto);
    }
    public List<Quarto> pesquisarTodos(){
        QuartoDAO QuartosDAO = new QuartoDAO();
        return QuartosDAO.pesquisarTodos();
    }
}