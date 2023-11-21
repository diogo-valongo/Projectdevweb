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
        }
        
        return clientes;    }

    @Override
    public void insert(Cliente t) {
        Conexao conexao = new Conexao();
        String query = "INSERT INTO Cliente (nome, senha) VALUES (?, ?);";
    }

    @Override
    public void update(Cliente t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
