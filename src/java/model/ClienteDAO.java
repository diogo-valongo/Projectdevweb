/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import entidade.Cliente;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author matmr
 */
public class ClienteDAO implements Dao<Cliente>{

    @Override
    public Cliente get(int id) {
        Cliente cliente = new Cliente();
        Conexao conexao = new Conexao();
        String query = "SELECT * FROM Cliente WHERE id = ?";
        
        try {
            PreparedStatement sql = conexao.getConexao().prepareStatement(query);
            sql.setInt(1, id);
            ResultSet resultado = sql.executeQuery();
            
            if(resultado != null) {
                resultado.next();
                cliente.setId(Integer.parseInt(resultado.getString("id")));
                cliente.setNome(resultado.getString("nome"));
                cliente.setSenha(resultado.getString("senha"));
            }
        }  catch (SQLException ex) {
            Logger.getLogger(AdministradorDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException(ex.getMessage());
        } finally {
            conexao.closeConexao();
        }
        
        return cliente;
    }

    @Override
    public ArrayList<Cliente> getAll() {
        ArrayList<Cliente> clientes = new ArrayList();
        Conexao conexao = new Conexao();
        String query = "SELECT * FROM Cliente";
        
        try {
            PreparedStatement sql = conexao.getConexao().prepareStatement(query);
            ResultSet resultado = sql.executeQuery();
            
            while(resultado.next()) {
                Cliente cliente = new Cliente();
                cliente.setId(Integer.parseInt(resultado.getString("id")));
                cliente.setNome(resultado.getString("nome"));
                cliente.setSenha(resultado.getString("senha"));
                clientes.add(cliente);
            }
        }  catch (SQLException ex) {
            Logger.getLogger(AdministradorDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException(ex.getMessage());
        } finally {
            conexao.closeConexao();
        }
        
        return clientes;    
    }

    @Override
    public void insert(Cliente t) {
        Conexao conexao = new Conexao();
        String query = "INSERT INTO Cliente (nome, senha) VALUES (?, ?)";
        
         try {
            PreparedStatement sql = conexao.getConexao().prepareStatement(query);
            sql.setString(1, t.getNome());
            sql.setString(2, t.getSenha());
            sql.executeQuery();

        } catch (SQLException ex) {
            Logger.getLogger(AdministradorDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Falha na query para criar cliente");
        } finally {
            conexao.closeConexao();
        }
    }

    @Override
    public void update(Cliente t) {
         String query = "UPDATE Cliente SET nome = ? where id = ?";
        Conexao conexao = new Conexao();

        try {
            PreparedStatement sql = conexao.getConexao().prepareStatement(query);
            sql.setString(1, t.getNome());
            sql.setInt(2, t.getId());
            sql.executeQuery();

        } catch (SQLException ex) {
            Logger.getLogger(AdministradorDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Falha na query para atualizar cliente");

        } finally {
            conexao.closeConexao();
        }
    }

    @Override
    public void delete(int id) {
 String query = "DELETE FROM Cliente WHERE id = ?";
        Conexao conexao = new Conexao();
        try {
            PreparedStatement sql = conexao.getConexao().prepareStatement(query);
            sql.setInt(1, id);
            sql.executeQuery();
            conexao.closeConexao();

        } catch (SQLException ex) {
            Logger.getLogger(AdministradorDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Falha na query para deletar cliente");
        } finally {
            conexao.closeConexao();
        }
    }
    
}
