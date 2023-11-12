/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Diogo Valongo
 */
enum TipoOperacao {
    SAQUE,
    DEPOSITO,
    TRANSFERENCIA,
    INVESTIMENTO
}

public class Operacao {
    private int id;
    private String nome;
    private TipoOperacao tipo;
    private double valorEntrada;
    private double valorSaida;
    private Conta contaEntrada;
    private Conta contaSaida;
    private Date data;
    // Calendar se usa Calendar c = Calendar.getInstance(); para pegar uma intancia de calendario 
    // Será util para usar um Date data = c.getTime(); para pegar a data de hoje
    // DateFormat será util para formatar essa data adiquirida
  
    public Operacao(int id, String nome, TipoOperacao tipo, double valorEntrada, double valorSaida, Conta contaEntrada, Conta contaSaida, Date data) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.valorEntrada = valorEntrada;
        this.valorSaida = valorSaida;
        this.contaEntrada = contaEntrada;
        this.contaSaida = contaSaida;
        this.data = data;
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

    public TipoOperacao getTipo() {
        return tipo;
    }

    public void setTipo(TipoOperacao tipo) {
        this.tipo = tipo;
    }

    public double getValorEntrada() {
        return valorEntrada;
    }

    public void setValorEntrada(double valorEntrada) {
        this.valorEntrada = valorEntrada;
    }

    public double getValorSaida() {
        return valorSaida;
    }

    public void setValorSaida(double valorSaida) {
        this.valorSaida = valorSaida;
    }

    public Conta getContaEntrada() {
        return contaEntrada;
    }

    public void setContaEntrada(Conta contaEntrada) {
        this.contaEntrada = contaEntrada;
    }

    public Conta getContaSaida() {
        return contaSaida;
    }

    public void setContaSaida(Conta contaSaida) {
        this.contaSaida = contaSaida;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }    
}
