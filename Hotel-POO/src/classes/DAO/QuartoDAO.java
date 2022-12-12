package classes.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import classes.Connection.Conexao;
import classes.DTO.Quarto;

public class QuartoDAO {
	
    final String NOMEDATABELA = "quarto";
    public boolean inserir(Quarto quarto) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "INSERT INTO " + NOMEDATABELA + " (ocupacao) VALUES (?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setBoolean(1, quarto.isOcupado());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean alterar(Quarto quarto) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "UPDATE " + NOMEDATABELA + " SET ocupacao = ? WHERE numero = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setBoolean(1, quarto.isOcupado());
            ps.setInt(2, quarto.getNumero());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
        	 e.printStackTrace();
             return false;
        }
    }
    public boolean desocupar(Quarto quarto) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "UPDATE " + NOMEDATABELA + " SET ocupacao = false WHERE numero = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, quarto.getNumero());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
        	 e.printStackTrace();
             return false;
        }
    }
    public boolean ocupar(Quarto quarto) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "UPDATE " + NOMEDATABELA + " SET ocupacao = true WHERE numero = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, quarto.getNumero());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
        	 e.printStackTrace();
             return false;
        }
    }
    public boolean excluir(Quarto quarto) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "DELETE FROM " + NOMEDATABELA + " WHERE numero = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, quarto.getNumero());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
        	 e.printStackTrace();
             return false;
        }
    }
    public Quarto procuraPorNumero(Quarto quarto) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE numero = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, quarto.getNumero());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Quarto obj = new Quarto();
                obj.setNumero(rs.getInt(1));
                obj.setOcupacao(rs.getBoolean(2));
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
    public List<Quarto> pesquisarTodos() {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + ";";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            List<Quarto> listObj = montarLista(rs);
            return listObj;
        } catch (Exception e) {
            //System.err.println("Erro: " + e.toString());
            //e.printStackTrace();
            return null;
        }
    }
    public List<Quarto> montarLista(ResultSet rs) {
        List<Quarto> listObj = new ArrayList<Quarto>();
        try {
            while (rs.next()) {
                Quarto obj = new Quarto();
                obj.setNumero(rs.getInt(1));
                obj.setOcupacao(rs.getBoolean(2));
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