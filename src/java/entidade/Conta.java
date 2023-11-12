/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade;

/**
 *
 * @author Diogo Valongo
 */

enum TipoConta {
    CORRENTE,
    POUPANCA
}
public class Conta {
    private int id;
    private int numero;    
    private TipoConta tipo;
    private double saldo;
    private Cliente cliente;

    public Conta(int id, int numero, TipoConta tipo, double saldo, Cliente cliente) {
        this.id = id;
        this.numero = numero;
        this.tipo = tipo;
        this.saldo = saldo;
        this.cliente = cliente;
    }
    
    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public TipoConta getTipo() {
        return tipo;
    }

    public void setTipo(TipoConta tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
