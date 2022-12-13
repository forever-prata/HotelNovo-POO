package classes.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import classes.Connection.Conexao;
import classes.DTO.Cliente;
import classes.DTO.Funcionario;
import classes.DTO.Quarto;
import classes.DTO.Reserva;

public class ReservaDAO {
	
    final String NOMEDATABELA = "reserva";
    public boolean inserir(Reserva reserva) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "INSERT INTO " + NOMEDATABELA + " (idcliente,idfuncionario,idquarto,valorDiaria,dias,entrada,saida,cancelada) VALUES (?,?,?,?,?,?,?,?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, reserva.getCliente().getIdCliente());
            ps.setInt(2, reserva.getFuncionario().getNumeroRegistro());
            ps.setInt(3, reserva.getQuarto().getNumero());
            ps.setDouble(4, reserva.getValorDiaria());
            ps.setInt(5, reserva.getDias());
            ps.setDate(6, new java.sql.Date(reserva.getEntrada().getTime()));
            ps.setDate(7, new java.sql.Date(reserva.getSaida().getTime()));
            ps.setBoolean(8, reserva.isCancelada());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean alterar(Reserva reserva) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "UPDATE " + NOMEDATABELA + " SET idcliente = ? , idfuncionario = ?, idquarto = ?, valorDiaria = ?, dias = ?, entrada = ?, saida = ?, cancelada = ? WHERE idreserva = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, reserva.getCliente().getIdCliente());
            ps.setInt(2, reserva.getFuncionario().getNumeroRegistro());
            ps.setInt(3, reserva.getQuarto().getNumero());
            ps.setDouble(4, reserva.getValorDiaria());
            ps.setInt(5, reserva.getDias());
            ps.setDate(6, new java.sql.Date(reserva.getEntrada().getTime()));
            ps.setDate(7, new java.sql.Date(reserva.getSaida().getTime()));
            ps.setBoolean(8, reserva.isCancelada());
            ps.setInt(9, reserva.getIdReserva());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
        	 e.printStackTrace();
             return false;
        }
    }
    public boolean excluir(Reserva reserva) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "DELETE FROM " + NOMEDATABELA + " WHERE idreserva = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, reserva.getIdReserva());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
        	 e.printStackTrace();
             return false;
        }
    }
    public Reserva procuraPorId(Reserva reserva) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM reserva,cliente,funcionario,quarto\r\n"
            		+ "where reserva.idcliente = cliente.idcliente\r\n"
            		+ "and reserva.idfuncionario = funcionario.numeroRegistro\r\n"
            		+ "and reserva.idquarto = quarto.numero\r\n"
            		+ "and idreserva = ?\r\n"
            		+ ";";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, reserva.getIdReserva());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Reserva obj = new Reserva();
                obj.setIdReserva(rs.getInt(1));
                
                Cliente c = new Cliente();
                
                c.setIdCliente(rs.getInt(10));
                c.setNome(rs.getString(11));
                c.setCpf(rs.getString(12));
                c.setEmail(rs.getString(13));
                c.setAtivo(rs.getBoolean(14));
                
                obj.setCliente(c);
                
                Funcionario f = new Funcionario();
                
                f.setNumeroRegistro(rs.getInt(15));
                f.setNome(rs.getString(16));
                f.setCpf(rs.getString(17));
                f.setEmail(rs.getString(18));
                f.setAtivo(rs.getBoolean(19));
                
                obj.setFuncionario(f);
                
                Quarto q = new Quarto();
                
                q.setNumero(rs.getInt(20));
                q.setOcupacao(rs.getBoolean(21));
                
                obj.setQuarto(q);
                
                ps.close();
                rs.close();
                conn.close();
                return obj;
            } else {
                ps.close();
                rs.close();
                conn.close();
                return null;
            }
        } catch (Exception e) {
        	 e.printStackTrace();
             return null;
        }
    }
    public List<Reserva> pesquisarMes(int i) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM reserva WHERE MONTH(entrada) = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, i);
            ResultSet rs = ps.executeQuery();
            List<Reserva> listObj = montarLista(rs);
            return listObj;
        } catch (Exception e) {
            //System.err.println("Erro: " + e.toString());
            //e.printStackTrace();
            return null;
        }
    }
    public boolean checkin(Reserva reserva) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "UPDATE " + NOMEDATABELA + " SET entrada = ? WHERE idreserva = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setDate(1, new java.sql.Date(reserva.getEntrada().getTime()));
            ps.setInt(2, reserva.getIdReserva());
            return true;
        } catch (Exception e) {
            //System.err.println("Erro: " + e.toString());
            //e.printStackTrace();
            return false;
        }
    }
    public boolean checkout(Reserva reserva) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "UPDATE " + NOMEDATABELA + " SET saida = ? WHERE idreserva = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setDate(1, new java.sql.Date(reserva.getSaida().getTime()));
            ps.setInt(2, reserva.getIdReserva());
            return true;
        } catch (Exception e) {
            //System.err.println("Erro: " + e.toString());
            //e.printStackTrace();
            return false;
        }
    }
    public List<Reserva> pesquisarTodos() {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM reserva,cliente,funcionario,quarto\r\n"
            		+ "where reserva.idcliente = cliente.idcliente\r\n"
            		+ "and reserva.idfuncionario = funcionario.numeroRegistro\r\n"
            		+ "and reserva.idquarto = quarto.numero\r\n"
            		+ "order by idreserva\r\n"
            		+ ";";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            List<Reserva> listObj = montarLista(rs);
            return listObj;
        } catch (Exception e) {
            //System.err.println("Erro: " + e.toString());
            //e.printStackTrace();
            return null;
        }
    }
    public List<Reserva> montarLista(ResultSet rs) {
        List<Reserva> listObj = new ArrayList<Reserva>();
        try {
            while (rs.next()) {
            	Reserva obj = new Reserva();
                obj.setIdReserva(rs.getInt(1));
                
                Cliente c = new Cliente();
                
                c.setIdCliente(rs.getInt(10));
                c.setNome(rs.getString(11));
                c.setCpf(rs.getString(12));
                c.setEmail(rs.getString(13));
                c.setAtivo(rs.getBoolean(14));
                
                obj.setCliente(c);
                
                Funcionario f = new Funcionario();
                
                f.setNumeroRegistro(rs.getInt(15));
                f.setNome(rs.getString(16));
                f.setCpf(rs.getString(17));
                f.setEmail(rs.getString(18));
                f.setAtivo(rs.getBoolean(19));
                
                obj.setFuncionario(f);
                
                Quarto q = new Quarto();
                
                q.setNumero(rs.getInt(20));
                q.setOcupacao(rs.getBoolean(21));
                
                obj.setQuarto(q);
                listObj.add(obj);
            }
            return listObj;
        } catch (Exception e) {
            //System.err.println("Erro: " + e.toString());
            //e.printStackTrace();
            return null;
        }
    }
	
}