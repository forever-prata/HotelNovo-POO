package classes.BO;

import classes.DTO.Funcionario;
import classes.DAO.FuncionarioDAO;
import java.util.List;

public class FuncionarioBO {

    public boolean inserir(Funcionario funcionario){
            FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
            return funcionarioDAO.inserir(funcionario);
    }
    public boolean alterar(Funcionario funcionario){
        FuncionarioDAO funcionariosDAO = new FuncionarioDAO();
        return funcionariosDAO.alterar(funcionario);
    }
    public boolean excluir(Funcionario funcionario){
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        return funcionarioDAO.excluir(funcionario);
    }
    public boolean desativar(Funcionario funcionario){
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        return funcionarioDAO.desativar(funcionario);
    }
    public boolean ativar(Funcionario funcionario){
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        return funcionarioDAO.ativar(funcionario);
    }
    public Funcionario procurarPorId(Funcionario funcionario){
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        return funcionarioDAO.procuraPorId(funcionario);
    }
    public List<Funcionario> pesquisarTodos(){
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        return funcionarioDAO.pesquisarTodos();
    }
}