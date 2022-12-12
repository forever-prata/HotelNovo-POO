package classes.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import classes.Connection.Conexao;
import classes.DTO.Cliente;

public class ClienteDAO {
	
    final String NOMEDATABELA = "cliente";
    public boolean inserir(Cliente cliente) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "INSERT INTO " + NOMEDATABELA + " (nome,cpf,email,ativo) VALUES (?,?,?,?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getCpf());
            ps.setString(3, cliente.getEmail());
            ps.setBoolean(4, cliente.isAtivo());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean alterar(Cliente cliente) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "UPDATE " + NOMEDATABELA + " SET nome = ? , cpf = ?, email = ?, ativo = ? WHERE idcliente = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getCpf());
            ps.setString(3, cliente.getEmail());
            ps.setBoolean(4, cliente.isAtivo());
            ps.setInt(5, cliente.getIdCliente());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
        	 e.printStackTrace();
             return false;
        }
    }
    public boolean desativar(Cliente cliente) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "UPDATE " + NOMEDATABELA + " SET ativo = false WHERE idcliente = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, cliente.getIdCliente());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
        	 e.printStackTrace();
             return false;
        }
    }
    public boolean ativar(Cliente cliente) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "UPDATE " + NOMEDATABELA + " SET ativo = true WHERE idcliente = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, cliente.getIdCliente());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
        	 e.printStackTrace();
             return false;
        }
    }
    public boolean excluir(Cliente cliente) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "DELETE FROM " + NOMEDATABELA + " WHERE idcliente = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, cliente.getIdCliente());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
        	 e.printStackTrace();
             return false;
        }
    }
    public Cliente procuraPorId(Cliente cliente) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE idcliente = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, cliente.getIdCliente());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Cliente obj = new Cliente();
                obj.setIdCliente(rs.getInt(1));
                obj.setNome(rs.getString(2));
                obj.setCpf(rs.getString(3));
                obj.setEmail(rs.getString(4));
                obj.setAtivo(rs.getBoolean(5));
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
    public List<Cliente> pesquisarTodos() {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + ";";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            List<Cliente> listObj = montarLista(rs);
            return listObj;
        } catch (Exception e) {
            //System.err.println("Erro: " + e.toString());
            //e.printStackTrace();
            return null;
        }
    }
    public List<Cliente> montarLista(ResultSet rs) {
        List<Cliente> listObj = new ArrayList<Cliente>();
        try {
            while (rs.next()) {
                Cliente obj = new Cliente();
                obj.setIdCliente(rs.getInt(1));
                obj.setNome(rs.getString(2));
                obj.setCpf(rs.getString(3));
                obj.setEmail(rs.getString(4));
                obj.setAtivo(rs.getBoolean(5));
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