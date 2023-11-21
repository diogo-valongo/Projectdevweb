/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import entidade.Conta;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author matmr
 */
public class ContaDAO implements Dao<Conta>{

    @Override
    public Conta get(int id) {
        Conta conta = new  Conta();
        Conexao conexao = new Conexao();
        String query = "SELECT * FROM Conta WHERE id = ?";
        
         try {
            PreparedStatement sql = conexao.getConexao().prepareStatement(query);
            sql.setInt(1, id);
            ResultSet resultado = sql.executeQuery();
            
            if(resultado != null) {
                resultado.next();
                conta.setId(Integer.parseInt(resultado.getString("id")));
                conta.setNumero(Integer.parseInt(resultado.getString("numero")));
                conta.setTipoId(Integer.parseInt(resultado.getString("tipoContaId")));
                conta.setSaldo(Double.parseDouble(resultado.getString("saldo")));
                conta.setClienteId(Integer.parseInt(resultado.getString("clienteId")));
            }
        }  catch (SQLException ex) {
            Logger.getLogger(AdministradorDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException(ex.getMessage());
        }
         return conta;
    }

    @Override
    public ArrayList<Conta> getAll() {
        ArrayList<Conta> contas = new ArrayList();
        Conexao conexao = new Conexao();
        String query = "SELECT * FROM Conta";
        
        try {
            PreparedStatement sql = conexao.getConexao().prepareStatement(query);
            ResultSet resultado = sql.executeQuery();
            
            while(resultado.next()) {
                Conta conta = new Conta();
                conta.setId(Integer.parseInt(resultado.getString("id")));
                conta.setNumero(Integer.parseInt(resultado.getString("numero")));
                conta.setTipoId(Integer.parseInt(resultado.getString("tipoContaId")));
                conta.setSaldo(Double.parseDouble(resultado.getString("saldo")));
                conta.setClienteId(Integer.parseInt(resultado.getString("clienteId")));
                contas.add(conta);
            }
        }  catch (SQLException ex) {
            Logger.getLogger(AdministradorDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException(ex.getMessage());
        }
        
        return contas;   
    }

    @Override
    public void insert(Conta t) {
        
        String query = "INSERT INTO Conta (numero, tipoContaId, saldo, clienteId) VALUES (?, ?, ?, ?)";
        Conexao conexao = new Conexao();
        try {
            PreparedStatement sql = conexao.getConexao().prepareStatement(query);
            sql.setInt(1, t.getNumero());
            sql.setInt(2, t.getTipoId());
            sql.setDouble(3, t.getSaldo());
            sql.setInt(4, t.getClienteId());
            sql.executeQuery();
            conexao.closeConexao();

        } catch (SQLException ex) {
            Logger.getLogger(AdministradorDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Falha na query para criar conta");
        }
    }

    @Override
    public void update(Conta t) {
        
        String query = "UPDATE Conta SET numero = ?, tipoContaId = ?, saldo = ?, clienteId = ? WHERE id = ?";
        Conexao conexao = new Conexao();

          try {
            PreparedStatement sql = conexao.getConexao().prepareStatement(query);
            sql.setInt(1, t.getNumero());
            sql.setInt(2, t.getTipoId());
            sql.setDouble(3, t.getSaldo());
            sql.setInt(4, t.getClienteId());            
            sql.setInt(5, t.getId());
            sql.executeQuery();
            conexao.closeConexao();

        } catch (SQLException ex) {
            Logger.getLogger(AdministradorDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Falha na query para criar cliente");
        }
         
    }

    @Override
    public void delete(int id) {
        String query = "DELETE FROM Conta WHERE id = ?";
        Conexao conexao = new Conexao();    
      try {
            PreparedStatement sql = conexao.getConexao().prepareStatement(query);
            sql.executeQuery();
            conexao.closeConexao();

        } catch (SQLException ex) {
            Logger.getLogger(AdministradorDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Falha na query para criar cliente");
        }
    }
    
}
