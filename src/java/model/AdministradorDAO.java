/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import entidade.Administrador;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author matmr
 */
public class AdministradorDAO implements Dao<Administrador> {

    @Override
    public Administrador get(int id) {           
        Administrador administrador = new Administrador();
        Conexao conexao = new Conexao();
        String query = "SELECT * FROM Administrador WHERE id = ?";
        
        try {
            PreparedStatement sql = conexao.getConexao().prepareStatement(query);
            sql.setInt(1, id);
            ResultSet resultado = sql.executeQuery();
            if (resultado != null) {
                resultado.next();
                administrador.setId(Integer.parseInt(resultado.getString("id")));
                administrador.setNome(resultado.getString("nome"));   
                administrador.setSenha(resultado.getString("senha"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdministradorDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException(ex.getMessage());

        }
        
        return administrador;
    }

    @Override
    public ArrayList<Administrador> getAll() {
        ArrayList<Administrador> administradores = new ArrayList();
        Conexao conexao = new Conexao();
        String query = "SELECT * FROM Administrador";
        
        try {
            PreparedStatement sql = conexao.getConexao().prepareStatement(query);
            ResultSet resultado = sql.executeQuery();
            if (resultado != null) {
              while (resultado.next()) {
                  
                  Administrador administrador = new Administrador();
                  administrador.setId(Integer.parseInt(resultado.getString("id")));
                  administrador.setNome(resultado.getString("nome"));
                  administrador.setSenha(resultado.getString("senha"));
                  administradores.add(administrador);
              }
            }
            conexao.closeConexao();
        } catch (SQLException ex) {
            Logger.getLogger(AdministradorDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Falha na query para listar administradores");
        }
        
        return administradores;
    }

    @Override
    public void insert(Administrador t) {
        String query = "INSERT INTO Administrador (nome, senha) VALUES (?, ?)"; 
        Conexao conexao = new Conexao();

         try {
            PreparedStatement sql = conexao.getConexao().prepareStatement(query);
            sql.setString(1, t.getNome());
            sql.setString(2, t.getSenha());
            sql.executeQuery();
            conexao.closeConexao();

        } catch (SQLException ex) {
            Logger.getLogger(AdministradorDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Falha na query para criar administrador");

        }
    }

    @Override
    public void update(Administrador t) {
        String query = "UPDATE Administrador SET nome = ? where id = ?";
        Conexao conexao = new Conexao();

        try {
            PreparedStatement sql = conexao.getConexao().prepareStatement(query);
            sql.setString(1, t.getNome());
            sql.setInt(2, t.getId());
            sql.executeQuery();
            conexao.closeConexao();

        } catch (SQLException ex) {
            Logger.getLogger(AdministradorDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Falha na query para atualizar administrador");

        }
    }

    @Override
    public void delete(int id) {
        String query = "DELETE FROM Administrador WHERE id = ?";
        Conexao conexao = new Conexao();
        try {
            PreparedStatement sql = conexao.getConexao().prepareStatement(query);
            sql.setInt(1, id);
            sql.executeQuery();
            conexao.closeConexao();

        } catch (SQLException ex) {
            Logger.getLogger(AdministradorDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Falha na query para deletar administrador");
        }
    }
    
}
