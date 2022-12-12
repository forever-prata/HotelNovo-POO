package classes.BO;

import classes.DTO.Cliente;
import classes.DAO.ClienteDAO;
import java.util.List;

public class ClienteBO {

    public boolean inserir(Cliente cliente){
            ClienteDAO clienteDAO = new ClienteDAO();
            return clienteDAO.inserir(cliente);
    }
    public boolean alterar(Cliente cliente){
        ClienteDAO clientesDAO = new ClienteDAO();
        return clientesDAO.alterar(cliente);
    }
    public boolean excluir(Cliente cliente){
        ClienteDAO clientesDAO = new ClienteDAO();
        return clientesDAO.excluir(cliente);
    }
    public boolean desativar(Cliente Cliente){
        ClienteDAO clientesDAO = new ClienteDAO();
        return clientesDAO.desativar(Cliente);
    }
    public boolean ativar(Cliente cliente){
        ClienteDAO clientesDAO = new ClienteDAO();
        return clientesDAO.ativar(cliente);
    }
    public Cliente procurarPorId(Cliente cliente){
        ClienteDAO clientesDAO = new ClienteDAO();
        return clientesDAO.procuraPorId(cliente);
    }
    public List<Cliente> pesquisarTodos(){
        ClienteDAO clientesDAO = new ClienteDAO();
        return clientesDAO.pesquisarTodos();
    }
}