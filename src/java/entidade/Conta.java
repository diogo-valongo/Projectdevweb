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
    private int tipoId;
    private double saldo;
    private int clienteId;
    
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

    public void setTipoId(int id)
    {
        this.tipoId = id;
    }
    
    public int getTipoId()
    {
        return this.tipoId;
    }
    
    public void setClienteId(int id)
    {
        this.clienteId = id;
    }
    
    public int getClienteId()
    {
        return this.clienteId;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
