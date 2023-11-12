/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade;

import java.util.List;

/**
 *
 * @author Diogo Valongo
 */
public class Cliente {
    private int id;
    private String nome;
    private String senha;
    private List<Conta> contas;

    public Cliente(int id, String nome, String senha, List<Conta> contas) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.contas = contas;
    }
    
    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
}
   
