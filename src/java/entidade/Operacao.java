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
    private int tipoId;
    private double valorEntrada;
    private double valorSaida;
    private int contaEntradaId;
    private int contaSaidaId;
    private Date data;
    // Calendar se usa Calendar c = Calendar.getInstance(); para pegar uma intancia de calendario 
    // Será util para usar um Date data = c.getTime(); para pegar a data de hoje
    // DateFormat será util para formatar essa data adiquirida
    
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

    public int getTipo() {
        return tipoId;
    }

    public void setTipo(int tipo) {
        this.tipoId = tipo;
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

    public int getContaEntrada() {
        return contaEntradaId;
    }

    public void setContaEntrada(int contaEntrada) {
        this.contaEntradaId = contaEntrada;
    }

    public int getContaSaida() {
        return contaSaidaId;
    }

    public void setContaSaida(int contaSaida) {
        this.contaSaidaId = contaSaida;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }    
}
