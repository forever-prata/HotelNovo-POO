package classes.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import classes.Connection.Conexao;
import classes.DTO.Funcionario;

public class FuncionarioDAO {
	
    final String NOMEDATABELA = "funcionario";
    public boolean inserir(Funcionario funcionario) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "INSERT INTO " + NOMEDATABELA + " (nome,cpf,email,ativo) VALUES (?,?,?,?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, funcionario.getNome());
            ps.setString(2, funcionario.getCpf());
            ps.setString(3, funcionario.getEmail());
            ps.setBoolean(4, funcionario.isAtivo());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean alterar(Funcionario funcionario) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "UPDATE " + NOMEDATABELA + " SET nome = ? , cpf = ?, email = ?, ativo = ? WHERE numeroRegistro = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, funcionario.getNome());
            ps.setString(2, funcionario.getCpf());
            ps.setString(3, funcionario.getEmail());
            ps.setBoolean(4, funcionario.isAtivo());
            ps.setInt(5, funcionario.getNumeroRegistro());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
        	 e.printStackTrace();
             return false;
        }
    }
    public boolean desativar(Funcionario funcionario) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "UPDATE " + NOMEDATABELA + " SET ativo = false WHERE numeroRegistro = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, funcionario.getNumeroRegistro());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
        	 e.printStackTrace();
             return false;
        }
    }
    public boolean ativar(Funcionario funcionario) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "UPDATE " + NOMEDATABELA + " SET ativo = true WHERE numeroRegistro = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, funcionario.getNumeroRegistro());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
        	 e.printStackTrace();
             return false;
        }
    }
    public boolean excluir(Funcionario funcionario) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "DELETE FROM " + NOMEDATABELA + " WHERE numeroRegistro = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, funcionario.getNumeroRegistro());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
        	 e.printStackTrace();
             return false;
        }
    }
    public Funcionario procuraPorId(Funcionario funcionario) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE numeroRegistro = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, funcionario.getNumeroRegistro());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Funcionario obj = new Funcionario();
                obj.setNumeroRegistro(rs.getInt(1));
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
    public List<Funcionario> pesquisarTodos() {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + ";";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            List<Funcionario> listObj = montarLista(rs);
            return listObj;
        } catch (Exception e) {
            //System.err.println("Erro: " + e.toString());
            //e.printStackTrace();
            return null;
        }
    }
    public List<Funcionario> montarLista(ResultSet rs) {
        List<Funcionario> listObj = new ArrayList<Funcionario>();
        try {
            while (rs.next()) {
                Funcionario obj = new Funcionario();
                obj.setNumeroRegistro(rs.getInt(1));
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