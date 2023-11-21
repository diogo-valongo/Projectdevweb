/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import entidade.Operacao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Date;
/**
 *
 * @author matmr
 */
public class OperacaoDAO implements Dao<Operacao> {

    @Override
    public Operacao get(int id) {
        Operacao operacao = new Operacao();
        Conexao conexao = new Conexao();
        String query = "SELECT * FROM Conta WHERE id = ?";
        try {
            PreparedStatement sql = conexao.getConexao().prepareStatement(query);
            sql.setInt(1, id);
            ResultSet resultado = sql.executeQuery();
            
            if(resultado != null) {
                resultado.next();
                operacao.setId(Integer.parseInt(resultado.getString("id")));
                operacao.setNome(resultado.getString("nome"));
                operacao.setTipo(Integer.parseInt(resultado.getString("tipoOperacaoId")));
                operacao.setValorEntrada(Double.parseDouble(resultado.getString("valorEntrada")));
                operacao.setValorSaida(Double.parseDouble(resultado.getString("valorSaida")));
                operacao.setContaEntrada(Integer.parseInt(resultado.getString("contaEntradaId")));
                operacao.setContaSaida(Integer.parseInt(resultado.getString("contaSaidaId")));
                operacao.setData(new Date());
            }
        }  catch (SQLException ex) {
            Logger.getLogger(AdministradorDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException(ex.getMessage());
        } finally {
            conexao.closeConexao();
        }
         return operacao;
    }

    @Override
    public ArrayList<Operacao> getAll() {
        ArrayList<Operacao> operacoes = new ArrayList();
        Conexao conexao = new Conexao();
        String query = "SELECT * FROM Conta WHERE";
        try {
            PreparedStatement sql = conexao.getConexao().prepareStatement(query);
            ResultSet resultado = sql.executeQuery();

            if(resultado != null) {
                resultado.next();
                Operacao operacao = new Operacao();
                operacao.setId(Integer.parseInt(resultado.getString("id")));
                operacao.setNome(resultado.getString("nome"));
                operacao.setTipo(Integer.parseInt(resultado.getString("tipoOperacaoId")));
                operacao.setValorEntrada(Double.parseDouble(resultado.getString("valorEntrada")));
                operacao.setValorSaida(Double.parseDouble(resultado.getString("valorSaida")));
                operacao.setContaEntrada(Integer.parseInt(resultado.getString("contaEntradaId")));
                operacao.setContaSaida(Integer.parseInt(resultado.getString("contaSaidaId")));
                operacao.setData(new Date(Date.parse((String)resultado.getString("data"))));
            }
        }  catch (SQLException ex) {
            Logger.getLogger(AdministradorDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException(ex.getMessage());
        } finally {
            conexao.closeConexao();
        }
        
        return operacoes;
    }

    @Override
    public void insert(Operacao t) {
        String query = "INSERT INTO Operacao (nome, tipoOperacaoId, valorEntrada, valorSaida, contaEntradaId, contaSaidaId, data) VALUES (?, ?, ?, ?, ?, ?, ?);";
        Conexao conexao = new Conexao();
 
        try {
            PreparedStatement sql = conexao.getConexao().prepareStatement(query);
            sql.setString(1, t.getNome());
            sql.setInt(2, t.getTipo());
            sql.setDouble(3, t.getValorEntrada());
            sql.setDouble(4, t.getValorSaida());
            sql.setInt(5, t.getContaEntrada());
            sql.setInt(6, t.getContaSaida());
            sql.setDate(7, new java.sql.Date(t.getData().getTime()));
    
            sql.executeQuery();
         } catch (SQLException ex) {
            Logger.getLogger(AdministradorDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException(ex.getMessage());
        } finally {
            conexao.closeConexao();
        }
    }

    @Override
    public void update(Operacao t) {
        throw new UnsupportedOperationException("Nao é possivel atualizar uma operacao."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Nao é possivel deletar uma operacao."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
