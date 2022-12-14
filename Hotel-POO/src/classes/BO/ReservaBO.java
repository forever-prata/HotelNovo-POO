package classes.BO;

import java.util.List;

import classes.DAO.ReservaDAO;
import classes.DTO.Reserva;

public class ReservaBO {
    public boolean inserir(Reserva reserva){
        ReservaDAO reservaDAO = new ReservaDAO();
        return reservaDAO.inserir(reserva);
}
    public boolean alterar(Reserva reserva){
        ReservaDAO reservaDAO = new ReservaDAO();
        return reservaDAO.alterar(reserva);
}
    public boolean excluir(Reserva reserva){
        ReservaDAO reservaDAO = new ReservaDAO();
        return reservaDAO.excluir(reserva);
}
    public Reserva procuraPorId(Reserva reserva){
        ReservaDAO reservaDAO = new ReservaDAO();
        return reservaDAO.procuraPorId(reserva);
}
    public List<Reserva> pesquisarMes (int i){
        ReservaDAO reservaDAO = new ReservaDAO();
        return reservaDAO.pesquisarMes(i);
    }
    public boolean checkin(Reserva reserva){
        ReservaDAO reservaDAO = new ReservaDAO();
        return reservaDAO.checkin(reserva);
}
    public boolean checkout(Reserva reserva){
        ReservaDAO reservaDAO = new ReservaDAO();
        return reservaDAO.checkout(reserva);
}
    public List<Reserva> pesquisarTodos(){
        ReservaDAO reservaDAO = new ReservaDAO();
        return reservaDAO.pesquisarTodos();
    }
    public Double Cancela(Reserva reserva){
        ReservaDAO reservaDAO = new ReservaDAO();
        return reservaDAO.cancelar(reserva);
    }
}
